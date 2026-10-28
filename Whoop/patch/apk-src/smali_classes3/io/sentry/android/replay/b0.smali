.class public final Lio/sentry/android/replay/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final E:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final w:Lio/sentry/q6;

.field public final x:Laj/c;

.field public y:Lio/sentry/android/replay/v;

.field public z:Lio/sentry/android/replay/w;


# direct methods
.method public constructor <init>(Lio/sentry/q6;Laj/c;)V
    .locals 1

    const-string v0, "mainLooperHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/b0;->w:Lio/sentry/q6;

    iput-object p2, p0, Lio/sentry/android/replay/b0;->x:Laj/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/replay/b0;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lio/sentry/android/replay/b0;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Lio/sentry/android/replay/b0;->w:Lio/sentry/q6;

    if-nez v0, :cond_0

    invoke-virtual {v2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/u6;->n:Z

    if-eqz v0, :cond_6

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Not capturing frames, recording is not running."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/u6;->n:Z

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v4, "Capturing a frame."

    new-array v5, v1, [Ljava/lang/Object;

    invoke-interface {v0, v3, v4, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/sentry/android/replay/v;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Failed to capture a frame"

    invoke-interface {v3, v4, v5, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    invoke-virtual {v2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/u6;->n:Z

    const/4 v3, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Posting the capture runnable again, frame rate is "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Lio/sentry/android/replay/b0;->z:Lio/sentry/android/replay/w;

    if-eqz v6, :cond_3

    iget v6, v6, Lio/sentry/android/replay/w;->e:I

    goto :goto_3

    :cond_3
    move v6, v3

    :goto_3
    const-string v7, " fps."

    invoke-static {v5, v6, v7}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-interface {v0, v4, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Lio/sentry/android/replay/b0;->z:Lio/sentry/android/replay/w;

    if-eqz v0, :cond_5

    iget v3, v0, Lio/sentry/android/replay/w;->e:I

    :cond_5
    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    div-long/2addr v5, v3

    iget-object v0, p0, Lio/sentry/android/replay/b0;->x:Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, p0, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Failed to post the capture runnable, main looper is shutting down."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    return-void
.end method
