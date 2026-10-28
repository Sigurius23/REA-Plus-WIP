.class public final Lch3/z;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final E:Lch3/o0;

.field public final F:Lxg3/j;

.field public final G:Ljava/util/LinkedList;

.field public H:Z

.field public final synthetic I:Lch3/a0;


# direct methods
.method public constructor <init>(Lch3/a0;Lch3/o0;Lxg3/j;)V
    .locals 0

    iput-object p1, p0, Lch3/z;->I:Lch3/a0;

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p2, p0, Lch3/z;->E:Lch3/o0;

    iput-object p3, p0, Lch3/z;->F:Lxg3/j;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lch3/z;->G:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final g()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lch3/z;->H:Z

    if-eqz v1, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lch3/z;->G:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lch3/z;->F:Lxg3/j;

    new-instance v2, Lch3/y;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lch3/y;-><init>(Lxg3/t;Ljava/lang/Object;I)V

    iget-object v0, p0, Lch3/z;->I:Lch3/a0;

    iget-wide v3, v0, Lch3/a0;->w:J

    iget-object v0, v0, Lch3/a0;->y:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4, v0}, Lxg3/j;->d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onCompleted()V
    .locals 3

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v0, p0, Lch3/z;->H:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/z;->H:Z

    new-instance v0, Ljava/util/LinkedList;

    iget-object v1, p0, Lch3/z;->G:Ljava/util/LinkedList;

    invoke-direct {v0, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lch3/z;->G:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lch3/z;->E:Lch3/o0;

    invoke-virtual {v2, v1}, Lch3/o0;->onNext(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lch3/z;->E:Lch3/o0;

    invoke-virtual {v0}, Lch3/o0;->onCompleted()V

    invoke-virtual {p0}, Lxg3/s;->b()V

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    iget-object v1, p0, Lch3/z;->E:Lch3/o0;

    invoke-static {v0, v1}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lch3/z;->H:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/z;->H:Z

    iget-object v0, p0, Lch3/z;->G:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lch3/z;->E:Lch3/o0;

    invoke-virtual {v0, p1}, Lch3/o0;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxg3/s;->b()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lch3/z;->H:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lch3/z;->G:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const v4, 0x7fffffff

    if-ne v3, v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    :cond_2
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lch3/z;->E:Lch3/o0;

    invoke-virtual {v1, v0}, Lch3/o0;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
