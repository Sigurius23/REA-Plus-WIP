.class public final Lud3/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final d:Ljava/util/ArrayDeque;

.field public final e:Ljava/util/ArrayDeque;

.field public final f:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    iput v0, p0, Lud3/u;->a:I

    const/4 v0, 0x5

    iput v0, p0, Lud3/u;->b:I

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lud3/u;->d:Ljava/util/ArrayDeque;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lud3/u;->e:Ljava/util/ArrayDeque;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lud3/u;->f:Ljava/util/ArrayDeque;

    return-void
.end method

.method public static c(Lud3/u;Lzd3/l;Lzd3/o;Lzd3/l;I)V
    .locals 10

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p4, Lwd3/h;->a:Ljava/util/TimeZone;

    invoke-virtual {p0}, Lud3/u;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object p4

    check-cast p4, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p4}, Ljava/util/concurrent/ThreadPoolExecutor;->isShutdown()Z

    move-result p4

    monitor-enter p0

    if-eqz p2, :cond_4

    :try_start_0
    iget-object v0, p0, Lud3/u;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p2}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const-string p1, "Call wasn\'t in-flight!"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_4
    :goto_0
    if-eqz p3, :cond_6

    iget-object v0, p3, Lzd3/l;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-object v0, p0, Lud3/u;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p3}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    const-string p1, "Call wasn\'t in-flight!"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_1
    if-eqz p1, :cond_7

    iget-object v0, p0, Lud3/u;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lzd3/l;->y:Lzd3/o;

    iget-boolean v2, v0, Lzd3/o;->y:Z

    if-nez v2, :cond_7

    iget-object v0, v0, Lzd3/o;->x:Lud3/o0;

    iget-object v0, v0, Lud3/o0;->a:Lud3/e0;

    iget-object v0, v0, Lud3/e0;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lud3/u;->b(Ljava/lang/String;)Lzd3/l;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, v0, Lzd3/l;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object v0, p1, Lzd3/l;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    :cond_7
    if-nez p2, :cond_8

    if-eqz p3, :cond_a

    :cond_8
    if-nez p4, :cond_9

    iget-object p2, p0, Lud3/u;->e:Ljava/util/ArrayDeque;

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_a

    :cond_9
    iget-object p2, p0, Lud3/u;->f:Ljava/util/ArrayDeque;

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    :cond_a
    if-eqz p4, :cond_b

    iget-object p2, p0, Lud3/u;->d:Ljava/util/ArrayDeque;

    invoke-static {p2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    iget-object p3, p0, Lud3/u;->d:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->clear()V

    new-instance p3, Lmc/h;

    invoke-direct {p3, p2}, Lmc/h;-><init>(Ljava/util/List;)V

    goto :goto_3

    :cond_b
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iget-object p3, p0, Lud3/u;->d:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p3

    const-string v0, "iterator(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_c
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzd3/l;

    iget-object v2, p0, Lud3/u;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    move-result v2

    iget v3, p0, Lud3/u;->a:I

    if-ge v2, v3, :cond_d

    iget-object v2, v0, Lzd3/l;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    iget v3, p0, Lud3/u;->b:I

    if-ge v2, v3, :cond_c

    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    iget-object v2, v0, Lzd3/l;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lud3/u;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_d
    new-instance p3, Lmc/h;

    invoke-direct {p3, p2}, Lmc/h;-><init>(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    monitor-exit p0

    iget-object p2, p3, Lmc/h;->a:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x1

    const/4 v2, 0x0

    move v3, v2

    :goto_4
    if-ge v3, p2, :cond_10

    iget-object v4, p3, Lmc/h;->a:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzd3/l;

    if-ne v4, p1, :cond_e

    move v0, v2

    goto :goto_5

    :cond_e
    iget-object v5, v4, Lzd3/l;->y:Lzd3/o;

    iget-object v6, v5, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v6, v5, p0}, Lud3/a0;->dispatcherQueueEnd(Lud3/j;Lud3/u;)V

    :goto_5
    if-eqz p4, :cond_f

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ljava/io/InterruptedIOException;

    const-string v6, "executor rejected"

    invoke-direct {v5, v6}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object v6, v4, Lzd3/l;->y:Lzd3/o;

    invoke-virtual {v6, v5}, Lzd3/o;->i(Ljava/io/IOException;)Ljava/io/IOException;

    iget-object v4, v4, Lzd3/l;->w:Lud3/k;

    invoke-interface {v4, v6, v5}, Lud3/k;->onFailure(Lud3/j;Ljava/io/IOException;)V

    goto :goto_6

    :cond_f
    invoke-virtual {p0}, Lud3/u;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v4, Lzd3/l;->y:Lzd3/o;

    iget-object v7, v6, Lzd3/o;->w:Lud3/l0;

    iget-object v7, v7, Lud3/l0;->a:Lud3/u;

    const-string v8, "<this>"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x3

    :try_start_1
    check-cast v5, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p0

    goto :goto_7

    :catch_0
    move-exception v5

    :try_start_2
    new-instance v8, Ljava/io/InterruptedIOException;

    const-string v9, "executor rejected"

    invoke-direct {v8, v9}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object v5, v4, Lzd3/l;->y:Lzd3/o;

    invoke-virtual {v5, v8}, Lzd3/o;->i(Ljava/io/IOException;)Ljava/io/IOException;

    iget-object v9, v4, Lzd3/l;->w:Lud3/k;

    invoke-interface {v9, v5, v8}, Lud3/k;->onFailure(Lud3/j;Ljava/io/IOException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v5, v6, Lzd3/o;->w:Lud3/l0;

    iget-object v5, v5, Lud3/l0;->a:Lud3/u;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v1, v1, v4, v7}, Lud3/u;->c(Lud3/u;Lzd3/l;Lzd3/o;Lzd3/l;I)V

    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :goto_7
    iget-object p1, v6, Lzd3/o;->w:Lud3/l0;

    iget-object p1, p1, Lud3/l0;->a:Lud3/u;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1, v1, v4, v7}, Lud3/u;->c(Lud3/u;Lzd3/l;Lzd3/o;Lzd3/l;I)V

    throw p0

    :cond_10
    if-eqz v0, :cond_11

    if-eqz p1, :cond_11

    iget-object p1, p1, Lzd3/l;->y:Lzd3/o;

    iget-object p2, p1, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {p2, p1, p0}, Lud3/a0;->dispatcherQueueStart(Lud3/j;Lud3/u;)V

    :cond_11
    return-void

    :goto_8
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized a()Ljava/util/concurrent/ExecutorService;
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lud3/u;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v0, :cond_0

    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lwd3/h;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Dispatcher"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lwd3/g;

    const/4 v2, 0x0

    invoke-direct {v8, v0, v2}, Lwd3/g;-><init>(Ljava/lang/String;Z)V

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Lud3/u;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lud3/u;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b(Ljava/lang/String;)Lzd3/l;
    .locals 4

    iget-object v0, p0, Lud3/u;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzd3/l;

    iget-object v3, v2, Lzd3/l;->y:Lzd3/o;

    iget-object v3, v3, Lzd3/o;->x:Lud3/o0;

    iget-object v3, v3, Lud3/o0;->a:Lud3/e0;

    iget-object v3, v3, Lud3/e0;->d:Ljava/lang/String;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_1
    iget-object v0, p0, Lud3/u;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd3/l;

    iget-object v2, v1, Lzd3/l;->y:Lzd3/o;

    iget-object v2, v2, Lzd3/o;->x:Lud3/o0;

    iget-object v2, v2, Lud3/o0;->a:Lud3/e0;

    iget-object v2, v2, Lud3/e0;->d:Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final declared-synchronized d()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lud3/u;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0

    iget-object v1, p0, Lud3/u;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v0, v1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final e(I)V
    .locals 1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lud3/u;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 p1, 0x7

    const/4 v0, 0x0

    invoke-static {p0, v0, v0, v0, p1}, Lud3/u;->c(Lud3/u;Lzd3/l;Lzd3/o;Lzd3/l;I)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_0
    const-string v0, "max < 1: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
