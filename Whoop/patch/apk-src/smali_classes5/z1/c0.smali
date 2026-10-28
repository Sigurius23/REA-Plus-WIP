.class public final Lz1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ld93/c;


# instance fields
.field public final w:Lz1/p;

.field public final x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lz1/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/c0;->w:Lz1/p;

    iput p2, p0, Lz1/c0;->x:I

    invoke-static {p1}, Lz1/q;->f(Lz1/p;)I

    move-result p1

    iput p1, p0, Lz1/c0;->y:I

    sub-int/2addr p3, p2

    iput p3, p0, Lz1/c0;->z:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lz1/c0;->w:Lz1/p;

    invoke-static {v0}, Lz1/q;->f(Lz1/p;)I

    move-result v0

    iget v1, p0, Lz1/c0;->y:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 1

    .line 8
    invoke-virtual {p0}, Lz1/c0;->a()V

    .line 9
    iget v0, p0, Lz1/c0;->x:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lz1/c0;->w:Lz1/p;

    invoke-virtual {p1, v0, p2}, Lz1/p;->add(ILjava/lang/Object;)V

    .line 10
    iget p2, p0, Lz1/c0;->z:I

    add-int/lit8 p2, p2, 0x1

    .line 11
    iput p2, p0, Lz1/c0;->z:I

    .line 12
    invoke-static {p1}, Lz1/q;->f(Lz1/p;)I

    move-result p1

    iput p1, p0, Lz1/c0;->y:I

    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz1/c0;->a()V

    .line 2
    iget v0, p0, Lz1/c0;->x:I

    .line 3
    iget v1, p0, Lz1/c0;->z:I

    add-int/2addr v0, v1

    .line 4
    iget-object v1, p0, Lz1/c0;->w:Lz1/p;

    invoke-virtual {v1, v0, p1}, Lz1/p;->add(ILjava/lang/Object;)V

    .line 5
    iget p1, p0, Lz1/c0;->z:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    .line 6
    iput p1, p0, Lz1/c0;->z:I

    .line 7
    invoke-static {v1}, Lz1/q;->f(Lz1/p;)I

    move-result p1

    iput p1, p0, Lz1/c0;->y:I

    return v0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 3
    invoke-virtual {p0}, Lz1/c0;->a()V

    .line 4
    iget v0, p0, Lz1/c0;->x:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lz1/c0;->w:Lz1/p;

    invoke-virtual {v0, p1, p2}, Lz1/p;->addAll(ILjava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget v1, p0, Lz1/c0;->z:I

    .line 6
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    add-int/2addr p2, v1

    iput p2, p0, Lz1/c0;->z:I

    .line 7
    invoke-static {v0}, Lz1/q;->f(Lz1/p;)I

    move-result p2

    iput p2, p0, Lz1/c0;->y:I

    :cond_0
    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    iget v0, p0, Lz1/c0;->z:I

    .line 2
    invoke-virtual {p0, v0, p1}, Lz1/c0;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 3

    iget v0, p0, Lz1/c0;->z:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lz1/c0;->a()V

    iget v0, p0, Lz1/c0;->z:I

    iget v1, p0, Lz1/c0;->x:I

    add-int/2addr v0, v1

    iget-object v2, p0, Lz1/c0;->w:Lz1/p;

    invoke-virtual {v2, v1, v0}, Lz1/p;->y0(II)V

    const/4 v0, 0x0

    iput v0, p0, Lz1/c0;->z:I

    invoke-static {v2}, Lz1/q;->f(Lz1/p;)I

    move-result v0

    iput v0, p0, Lz1/c0;->y:I

    :cond_0
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lz1/c0;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz1/c0;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_2
    return v1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz1/c0;->a()V

    iget v0, p0, Lz1/c0;->z:I

    invoke-static {p1, v0}, Lz1/q;->a(II)V

    iget v0, p0, Lz1/c0;->x:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lz1/c0;->w:Lz1/p;

    invoke-virtual {p1, v0}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    invoke-virtual {p0}, Lz1/c0;->a()V

    iget v0, p0, Lz1/c0;->z:I

    iget v1, p0, Lz1/c0;->x:I

    add-int/2addr v0, v1

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    iget-object v3, p0, Lz1/c0;->w:Lz1/p;

    invoke-virtual {v3, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sub-int/2addr v2, v1

    return v2

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    iget v0, p0, Lz1/c0;->z:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz1/c0;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 3

    invoke-virtual {p0}, Lz1/c0;->a()V

    iget v0, p0, Lz1/c0;->z:I

    iget v1, p0, Lz1/c0;->x:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-lt v0, v1, :cond_1

    iget-object v2, p0, Lz1/c0;->w:Lz1/p;

    invoke-virtual {v2, v0}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lz1/c0;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lz1/c0;->a()V

    .line 3
    new-instance v0, Lkotlin/jvm/internal/e0;

    .line 4
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    add-int/lit8 p1, p1, -0x1

    .line 5
    iput p1, v0, Lkotlin/jvm/internal/e0;->w:I

    .line 6
    new-instance p1, Lm83/h0;

    invoke-direct {p1, v0, p0}, Lm83/h0;-><init>(Lkotlin/jvm/internal/e0;Lz1/c0;)V

    return-object p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lz1/c0;->a()V

    .line 4
    iget v0, p0, Lz1/c0;->x:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lz1/c0;->w:Lz1/p;

    invoke-virtual {p1, v0}, Lz1/p;->remove(I)Ljava/lang/Object;

    move-result-object v0

    .line 5
    iget v1, p0, Lz1/c0;->z:I

    add-int/lit8 v1, v1, -0x1

    .line 6
    iput v1, p0, Lz1/c0;->z:I

    .line 7
    invoke-static {p1}, Lz1/q;->f(Lz1/p;)I

    move-result p1

    iput p1, p0, Lz1/c0;->y:I

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lz1/c0;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lz1/c0;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 3

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lz1/c0;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz v1, :cond_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 10

    invoke-virtual {p0}, Lz1/c0;->a()V

    iget-object v0, p0, Lz1/c0;->w:Lz1/p;

    iget v1, p0, Lz1/c0;->x:I

    iget v2, p0, Lz1/c0;->z:I

    add-int/2addr v2, v1

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v3

    :cond_0
    sget-object v4, Lz1/q;->a:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, v0, Lz1/p;->w:Lz1/w;

    const-string v6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v5

    check-cast v5, Lz1/w;

    iget v6, v5, Lz1/w;->d:I

    iget-object v5, v5, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v4

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lt1/c;->g()Lt1/f;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ljava/util/AbstractList;->subList(II)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, p1}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    invoke-virtual {v4}, Lt1/f;->d()Lt1/c;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v7, 0x1

    if-nez v5, :cond_1

    iget-object v5, v0, Lz1/p;->w:Lz1/w;

    const-string v8, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v8

    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v9

    invoke-static {v5, v0, v9}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v5

    check-cast v5, Lz1/w;

    invoke-static {v5, v6, v4, v7}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v8

    invoke-static {v9, v0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v4, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v8

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lz1/p;->size()I

    move-result p1

    sub-int/2addr v3, p1

    if-lez v3, :cond_2

    iget-object p1, p0, Lz1/c0;->w:Lz1/p;

    invoke-static {p1}, Lz1/q;->f(Lz1/p;)I

    move-result p1

    iput p1, p0, Lz1/c0;->y:I

    iget p1, p0, Lz1/c0;->z:I

    sub-int/2addr p1, v3

    iput p1, p0, Lz1/c0;->z:I

    :cond_2
    if-lez v3, :cond_3

    return v7

    :cond_3
    const/4 p1, 0x0

    return p1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lz1/c0;->z:I

    invoke-static {p1, v0}, Lz1/q;->a(II)V

    invoke-virtual {p0}, Lz1/c0;->a()V

    iget v0, p0, Lz1/c0;->x:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lz1/c0;->w:Lz1/p;

    invoke-virtual {v0, p1, p2}, Lz1/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0}, Lz1/q;->f(Lz1/p;)I

    move-result p2

    iput p2, p0, Lz1/c0;->y:I

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lz1/c0;->z:I

    return v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    iget v0, p0, Lz1/c0;->z:I

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
    invoke-virtual {p0}, Lz1/c0;->a()V

    new-instance v0, Lz1/c0;

    iget v1, p0, Lz1/c0;->x:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    iget-object v1, p0, Lz1/c0;->w:Lz1/p;

    invoke-direct {v0, v1, p1, p2}, Lz1/c0;-><init>(Lz1/p;II)V

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
