.class public final Ly73/o;
.super Ll73/f;
.source "SourceFile"


# instance fields
.field public final w:Ljava/util/concurrent/ScheduledExecutorService;

.field public final x:Ln73/a;

.field public volatile y:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly73/o;->w:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Ln73/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly73/o;->x:Ln73/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ln73/b;
    .locals 4

    sget-object v0, Lq73/d;->w:Lq73/d;

    iget-boolean v1, p0, Ly73/o;->y:Z

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ly73/m;

    iget-object v2, p0, Ly73/o;->x:Ln73/a;

    invoke-direct {v1, p1, v2}, Ly73/m;-><init>(Ljava/lang/Runnable;Lq73/b;)V

    iget-object p1, p0, Ly73/o;->x:Ln73/a;

    invoke-virtual {p1, v1}, Ln73/a;->a(Ln73/b;)Z

    const-wide/16 v2, 0x0

    cmp-long p1, p2, v2

    if-gtz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Ly73/o;->w:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Ly73/o;->w:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    :goto_0
    invoke-virtual {v1, p1}, Ly73/m;->a(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :goto_1
    invoke-virtual {p0}, Ly73/o;->dispose()V

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final dispose()V
    .locals 1

    iget-boolean v0, p0, Ly73/o;->y:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly73/o;->y:Z

    iget-object v0, p0, Ly73/o;->x:Ln73/a;

    invoke-virtual {v0}, Ln73/a;->dispose()V

    :cond_0
    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Ly73/o;->y:Z

    return v0
.end method
