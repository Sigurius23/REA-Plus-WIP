.class public final Leh3/p;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lxg3/t;


# instance fields
.field public final w:Lgh3/m;

.field public final x:Lbh3/a;


# direct methods
.method public constructor <init>(Lbh3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    iput-object p1, p0, Leh3/p;->x:Lbh3/a;

    .line 3
    new-instance p1, Lgh3/m;

    .line 4
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Leh3/p;->w:Lgh3/m;

    return-void
.end method

.method public constructor <init>(Lbh3/a;Lgh3/m;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 10
    iput-object p1, p0, Leh3/p;->x:Lbh3/a;

    .line 11
    new-instance p1, Lgh3/m;

    new-instance v0, Leh3/o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Leh3/o;-><init>(Leh3/p;Lxg3/t;I)V

    invoke-direct {p1, v0}, Lgh3/m;-><init>(Lxg3/t;)V

    iput-object p1, p0, Leh3/p;->w:Lgh3/m;

    return-void
.end method

.method public constructor <init>(Lbh3/a;Lmh3/c;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    iput-object p1, p0, Leh3/p;->x:Lbh3/a;

    .line 8
    new-instance p1, Lgh3/m;

    new-instance v0, Leh3/o;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Leh3/o;-><init>(Leh3/p;Lxg3/t;I)V

    invoke-direct {p1, v0}, Lgh3/m;-><init>(Lxg3/t;)V

    iput-object p1, p0, Leh3/p;->w:Lgh3/m;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Leh3/p;->w:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    return v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Leh3/p;->w:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Leh3/p;->w:Lgh3/m;

    invoke-virtual {v0}, Lgh3/m;->b()V

    :cond_0
    return-void
.end method

.method public final c(Ljava/util/concurrent/Future;)V
    .locals 1

    new-instance v0, Leh3/n;

    invoke-direct {v0, p0, p1}, Leh3/n;-><init>(Leh3/p;Ljava/util/concurrent/Future;)V

    iget-object p1, p0, Leh3/p;->w:Lgh3/m;

    invoke-virtual {p1, v0}, Lgh3/m;->c(Lxg3/t;)V

    return-void
.end method

.method public final run()V
    .locals 3

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Leh3/p;->x:Lbh3/a;

    invoke-interface {v0}, Lbh3/a;->call()V
    :try_end_0
    .catch Lrx/exceptions/OnErrorNotImplementedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Leh3/p;->b()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :goto_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Fatal Exception thrown on Scheduler.Worker thread."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    invoke-virtual {p0}, Leh3/p;->b()V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :goto_2
    :try_start_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Exception thrown on Scheduler.Worker thread. Add `onError` handling."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :goto_3
    return-void

    :goto_4
    invoke-virtual {p0}, Leh3/p;->b()V

    throw v0
.end method
