.class public final Lz1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lz1/z;
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Ld93/c;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz1/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public w:Lz1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz1/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz1/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 8
    sget-object v0, Lt1/j;->x:Lt1/j;

    invoke-direct {p0, v0}, Lz1/p;-><init>(Lt1/c;)V

    return-void
.end method

.method public constructor <init>(Lt1/c;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v0

    .line 3
    new-instance v1, Lz1/w;

    invoke-virtual {v0}, Lz1/f;->g()J

    move-result-wide v2

    invoke-direct {v1, v2, v3, p1}, Lz1/w;-><init>(JLt1/c;)V

    .line 4
    instance-of v0, v0, Lz1/a;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lz1/w;

    const/4 v2, 0x1

    int-to-long v2, v2

    invoke-direct {v0, v2, v3, p1}, Lz1/w;-><init>(JLt1/c;)V

    .line 6
    iput-object v0, v1, Lz1/b0;->b:Lz1/b0;

    .line 7
    :cond_0
    iput-object v1, p0, Lz1/p;->w:Lz1/w;

    return-void
.end method


# virtual methods
.method public final N()Lz1/b0;
    .locals 1

    iget-object v0, p0, Lz1/p;->w:Lz1/w;

    return-object v0
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 6

    .line 22
    :cond_0
    sget-object v0, Lz1/q;->a:Ljava/lang/Object;

    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    .line 25
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    .line 27
    iget v2, v1, Lz1/w;->d:I

    .line 28
    iget-object v1, v1, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    monitor-exit v0

    .line 30
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 31
    invoke-virtual {v1, p1, p2}, Lt1/c;->c(ILjava/lang/Object;)Lt1/c;

    move-result-object v0

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 33
    :cond_1
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    .line 34
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    sget-object v3, Lz1/l;->c:Ljava/lang/Object;

    .line 36
    monitor-enter v3

    .line 37
    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v4

    .line 38
    invoke-static {v1, p0, v4}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    const/4 v5, 0x1

    .line 39
    invoke-static {v1, v2, v0, v5}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    monitor-exit v3

    .line 41
    invoke-static {v4, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    .line 42
    monitor-exit v3

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    :cond_0
    sget-object v0, Lz1/q;->a:Ljava/lang/Object;

    .line 2
    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    .line 4
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    .line 6
    iget v2, v1, Lz1/w;->d:I

    .line 7
    iget-object v1, v1, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    monitor-exit v0

    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {v1, p1}, Lt1/c;->d(Ljava/lang/Object;)Lt1/c;

    move-result-object v0

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 12
    :cond_1
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    .line 13
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget-object v3, Lz1/l;->c:Ljava/lang/Object;

    .line 15
    monitor-enter v3

    .line 16
    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v4

    .line 17
    invoke-static {v1, p0, v4}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    const/4 v5, 0x1

    .line 18
    invoke-static {v1, v2, v0, v5}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    monitor-exit v3

    .line 20
    invoke-static {v4, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v0, :cond_0

    return v5

    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v3

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 1
    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/16 v1, 0xe

    invoke-direct {v0, p1, p2, v1}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(ILjava/lang/Object;I)V

    invoke-static {p0, v0}, Lz1/q;->g(Lz1/p;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 6

    .line 2
    :cond_0
    sget-object v0, Lz1/q;->a:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    .line 5
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    .line 7
    iget v2, v1, Lz1/w;->d:I

    .line 8
    iget-object v1, v1, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    monitor-exit v0

    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {v1, p1}, Lt1/c;->e(Ljava/util/Collection;)Lt1/c;

    move-result-object v0

    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 13
    :cond_1
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    .line 14
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v3, Lz1/l;->c:Ljava/lang/Object;

    .line 16
    monitor-enter v3

    .line 17
    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v4

    .line 18
    invoke-static {v1, p0, v4}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    const/4 v5, 0x1

    .line 19
    invoke-static {v1, v2, v0, v5}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    monitor-exit v3

    .line 21
    invoke-static {v4, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v0, :cond_0

    return v5

    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v3

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final clear()V
    .locals 5

    iget-object v0, p0, Lz1/p;->w:Lz1/w;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v2

    invoke-static {v0, p0, v2}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lz1/w;

    sget-object v3, Lz1/q;->a:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v4, Lt1/j;->x:Lt1/j;

    iput-object v4, v0, Lz1/w;->c:Lt1/c;

    iget v4, v0, Lz1/w;->d:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Lz1/w;->d:I

    iget v4, v0, Lz1/w;->e:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Lz1/w;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    invoke-static {v2, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v3

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    monitor-exit v1

    throw v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p0}, Lz1/q;->e(Lz1/p;)Lz1/w;

    move-result-object v0

    iget-object v0, v0, Lz1/w;->c:Lt1/c;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    invoke-static {p0}, Lz1/q;->e(Lz1/p;)Lz1/w;

    move-result-object v0

    iget-object v0, v0, Lz1/w;->c:Lt1/c;

    invoke-interface {v0, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Lz1/q;->e(Lz1/p;)Lz1/w;

    move-result-object v0

    iget-object v0, v0, Lz1/w;->c:Lt1/c;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-static {p0}, Lz1/q;->e(Lz1/p;)Lz1/w;

    move-result-object v0

    iget-object v0, v0, Lz1/w;->c:Lt1/c;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-static {p0}, Lz1/q;->e(Lz1/p;)Lz1/w;

    move-result-object v0

    iget-object v0, v0, Lz1/w;->c:Lt1/c;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lz1/p;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-static {p0}, Lz1/q;->e(Lz1/p;)Lz1/w;

    move-result-object v0

    iget-object v0, v0, Lz1/w;->c:Lt1/c;

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 2

    .line 1
    new-instance v0, Ln83/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln83/b;-><init>(Lz1/p;I)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 2
    new-instance v0, Ln83/b;

    invoke-direct {v0, p0, p1}, Ln83/b;-><init>(Lz1/p;I)V

    return-object v0
.end method

.method public final m0(Lz1/b0;)V
    .locals 1

    iget-object v0, p0, Lz1/p;->w:Lz1/w;

    iput-object v0, p1, Lz1/b0;->b:Lz1/b0;

    check-cast p1, Lz1/w;

    iput-object p1, p0, Lz1/p;->w:Lz1/w;

    return-void
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 2
    :cond_0
    sget-object v1, Lz1/q;->a:Ljava/lang/Object;

    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v2, p0, Lz1/p;->w:Lz1/w;

    .line 5
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {v2}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v2

    check-cast v2, Lz1/w;

    .line 7
    iget v3, v2, Lz1/w;->d:I

    .line 8
    iget-object v2, v2, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    monitor-exit v1

    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {v2, p1}, Lt1/c;->l(I)Lt1/c;

    move-result-object v1

    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    iget-object v2, p0, Lz1/p;->w:Lz1/w;

    .line 14
    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v4, Lz1/l;->c:Ljava/lang/Object;

    .line 16
    monitor-enter v4

    .line 17
    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v5

    .line 18
    invoke-static {v2, p0, v5}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v2

    check-cast v2, Lz1/w;

    const/4 v6, 0x1

    .line 19
    invoke-static {v2, v3, v1, v6}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    monitor-exit v4

    .line 21
    invoke-static {v5, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v1, :cond_0

    :goto_0
    return-object v0

    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v4

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 6

    .line 23
    :cond_0
    sget-object v0, Lz1/q;->a:Ljava/lang/Object;

    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    .line 26
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    .line 28
    iget v2, v1, Lz1/w;->d:I

    .line 29
    iget-object v1, v1, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    monitor-exit v0

    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 32
    invoke-virtual {v1, p1}, Lm83/e;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    .line 33
    invoke-virtual {v1, v0}, Lt1/c;->l(I)Lt1/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 34
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p1, 0x0

    return p1

    .line 35
    :cond_2
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    .line 36
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget-object v3, Lz1/l;->c:Ljava/lang/Object;

    .line 38
    monitor-enter v3

    .line 39
    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v4

    .line 40
    invoke-static {v1, p0, v4}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    const/4 v5, 0x1

    .line 41
    invoke-static {v1, v2, v0, v5}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    monitor-exit v3

    .line 43
    invoke-static {v4, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v0, :cond_0

    return v5

    :catchall_0
    move-exception p1

    .line 44
    monitor-exit v3

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 6

    :cond_0
    sget-object v0, Lz1/q;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    iget v2, v1, Lz1/w;->d:I

    iget-object v1, v1, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v0, Lt1/b;

    const/4 v3, 0x0

    invoke-direct {v0, v3, p1}, Lt1/b;-><init>(ILjava/util/Collection;)V

    invoke-virtual {v1, v0}, Lt1/c;->j(Lt1/b;)Lt1/c;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v3

    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v4

    invoke-static {v1, p0, v4}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    const/4 v5, 0x1

    invoke-static {v1, v2, v0, v5}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    invoke-static {v4, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v0, :cond_0

    return v5

    :catchall_0
    move-exception p1

    monitor-exit v3

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 2

    new-instance v0, Lt1/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Lt1/b;-><init>(ILjava/util/Collection;)V

    invoke-static {p0, v0}, Lz1/q;->g(Lz1/p;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0, p1}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    sget-object v1, Lz1/q;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lz1/p;->w:Lz1/w;

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v2

    check-cast v2, Lz1/w;

    iget v3, v2, Lz1/w;->d:I

    iget-object v2, v2, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v1

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p2}, Lt1/c;->m(ILjava/lang/Object;)Lt1/c;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lz1/p;->w:Lz1/w;

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v5

    invoke-static {v2, p0, v5}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v2

    check-cast v2, Lz1/w;

    const/4 v6, 0x0

    invoke-static {v2, v3, v1, v6}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    invoke-static {v5, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v1, :cond_0

    :goto_0
    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit v4

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final size()I
    .locals 1

    invoke-static {p0}, Lz1/q;->e(Lz1/p;)Lz1/w;

    move-result-object v0

    iget-object v0, v0, Lz1/w;->c:Lt1/c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Lz1/p;->size()I

    move-result v0

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "fromIndex or toIndex are out of bounds"

    invoke-static {v0}, Lp1/q1;->a(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Lz1/c0;

    invoke-direct {v0, p0, p1, p2}, Lz1/c0;-><init>(Lz1/p;II)V

    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/k;->r(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->s(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lz1/p;->w:Lz1/w;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lz1/w;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SnapshotStateList(value="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lz1/w;->c:Lt1/c;

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

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p0}, Lz1/q;->e(Lz1/p;)Lz1/w;

    move-result-object p2

    iget-object p2, p2, Lz1/w;->c:Lt1/c;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final y0(II)V
    .locals 6

    :cond_0
    sget-object v0, Lz1/q;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    iget v2, v1, Lz1/w;->d:I

    iget-object v1, v1, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt1/c;->g()Lt1/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractList;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->clear()V

    invoke-virtual {v0}, Lt1/f;->d()Lt1/c;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v3

    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v4

    invoke-static {v1, p0, v4}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    const/4 v5, 0x1

    invoke-static {v1, v2, v0, v5}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

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
