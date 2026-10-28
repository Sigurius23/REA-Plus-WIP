.class public final Lx8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lx8/p;

.field public final b:Lx8/r;

.field public final c:Lx8/g;

.field public final d:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final e:Ljava/util/ArrayDeque;

.field public final f:Ljava/util/ArrayDeque;

.field public final g:Ljava/lang/Object;

.field public h:Z

.field public final i:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lx8/p;Lx8/g;)V
    .locals 6

    .line 1
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    const/4 v5, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lx8/i;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lx8/p;Lx8/g;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lx8/p;Lx8/g;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p3, p0, Lx8/i;->a:Lx8/p;

    .line 4
    iput-object p1, p0, Lx8/i;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    iput-object p4, p0, Lx8/i;->c:Lx8/g;

    .line 6
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx8/i;->g:Ljava/lang/Object;

    .line 7
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lx8/i;->e:Ljava/util/ArrayDeque;

    .line 8
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lx8/i;->f:Ljava/util/ArrayDeque;

    .line 9
    new-instance p1, Llo/g;

    const/4 p4, 0x1

    invoke-direct {p1, p0, p4}, Llo/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p3, p2, p1}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object p1

    .line 10
    iput-object p1, p0, Lx8/i;->b:Lx8/r;

    .line 11
    iput-boolean p5, p0, Lx8/i;->i:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lx8/i;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lx8/i;->h:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lx8/i;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v2, Lx8/h;

    invoke-direct {v2, p1}, Lx8/h;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 5

    invoke-virtual {p0}, Lx8/i;->f()V

    iget-object v0, p0, Lx8/i;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lx8/i;->b:Lx8/r;

    iget-object v2, v1, Lx8/r;->a:Landroid/os/Handler;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v2

    iget-object v4, v1, Lx8/r;->a:Landroid/os/Handler;

    invoke-virtual {v4, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    iput-object v3, v2, Lx8/q;->a:Landroid/os/Message;

    iget-object v1, v1, Lx8/r;->a:Landroid/os/Handler;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    invoke-virtual {v2}, Lx8/q;->a()V

    :cond_1
    iget-object v1, p0, Lx8/i;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final c(ILx8/f;)V
    .locals 3

    invoke-virtual {p0}, Lx8/i;->f()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v1, p0, Lx8/i;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    new-instance v1, Landroidx/profileinstaller/a;

    const/4 v2, 0x6

    invoke-direct {v1, v0, p1, p2, v2}, Landroidx/profileinstaller/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    iget-object p1, p0, Lx8/i;->f:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d()V
    .locals 5

    invoke-virtual {p0}, Lx8/i;->f()V

    iget-object v0, p0, Lx8/i;->g:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lx8/i;->h:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lx8/i;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx8/h;

    iget-object v3, p0, Lx8/i;->c:Lx8/g;

    iput-boolean v1, v2, Lx8/h;->d:Z

    iget-boolean v4, v2, Lx8/h;->c:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    iput-boolean v4, v2, Lx8/h;->c:Z

    iget-object v4, v2, Lx8/h;->a:Ljava/lang/Object;

    iget-object v2, v2, Lx8/h;->b:Llo/e;

    invoke-virtual {v2}, Llo/e;->c()Lu8/n;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Lx8/g;->a(Ljava/lang/Object;Lu8/n;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx8/i;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final e(ILx8/f;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx8/i;->c(ILx8/f;)V

    invoke-virtual {p0}, Lx8/i;->b()V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-boolean v0, p0, Lx8/i;->i:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lx8/i;->b:Lx8/r;

    iget-object v1, v1, Lx8/r;->a:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    return-void
.end method
