.class public final Ll73/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln73/b;
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:Lu73/a;

.field public final x:Ll73/f;

.field public y:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Lu73/a;Ll73/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll73/e;->w:Lu73/a;

    iput-object p2, p0, Ll73/e;->x:Ll73/f;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    iget-object v0, p0, Ll73/e;->y:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll73/e;->x:Ll73/f;

    instance-of v1, v0, Ly73/j;

    if-eqz v1, :cond_1

    check-cast v0, Ly73/j;

    iget-boolean v1, v0, Ly73/j;->x:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Ly73/j;->x:Z

    iget-object v0, v0, Ly73/j;->w:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Ll73/e;->x:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-object v0, p0, Ll73/e;->x:Ll73/f;

    invoke-interface {v0}, Ln73/b;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public final run()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll73/e;->y:Ljava/lang/Thread;

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ll73/e;->w:Lu73/a;

    invoke-virtual {v1}, Lu73/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ll73/e;->dispose()V

    iput-object v0, p0, Ll73/e;->y:Ljava/lang/Thread;

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {p0}, Ll73/e;->dispose()V

    iput-object v0, p0, Ll73/e;->y:Ljava/lang/Thread;

    throw v1
.end method
