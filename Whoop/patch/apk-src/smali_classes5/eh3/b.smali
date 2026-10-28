.class public final Leh3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/ThreadFactory;

.field public final b:J

.field public final c:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final d:Lmh3/c;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public final f:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public constructor <init>(Lgh3/i;JLjava/util/concurrent/TimeUnit;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh3/b;->a:Ljava/util/concurrent/ThreadFactory;

    if-eqz p4, :cond_0

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p2

    :goto_0
    move-wide v2, p2

    goto :goto_1

    :cond_0
    const-wide/16 p2, 0x0

    goto :goto_0

    :goto_1
    iput-wide v2, p0, Leh3/b;->b:J

    new-instance p2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p2, p0, Leh3/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance p2, Lmh3/c;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Leh3/b;->d:Lmh3/c;

    if-eqz p4, :cond_1

    new-instance p2, Leh3/a;

    invoke-direct {p2, p1}, Leh3/a;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    const/4 p1, 0x1

    invoke-static {p1, p2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {v0}, Leh3/k;->g(Ljava/util/concurrent/ScheduledExecutorService;)Z

    new-instance v1, Landroidx/databinding/s;

    const/4 p1, 0x3

    invoke-direct {v1, p0, p1}, Landroidx/databinding/s;-><init>(Ljava/lang/Object;I)V

    sget-object v6, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v4, v2

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    move-object p1, v0

    :goto_2
    iput-object v0, p0, Leh3/b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Leh3/b;->f:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Leh3/b;->d:Lmh3/c;

    :try_start_0
    iget-object v1, p0, Leh3/b;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Leh3/b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-virtual {v0}, Lmh3/c;->b()V

    return-void

    :goto_1
    invoke-virtual {v0}, Lmh3/c;->b()V

    throw v1
.end method
