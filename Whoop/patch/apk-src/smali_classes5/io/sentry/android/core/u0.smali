.class public final Lio/sentry/android/core/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/android/core/b0;


# instance fields
.field public final E:Lio/sentry/util/a;

.field public final F:Lio/sentry/i4;

.field public final G:Z

.field public final H:Z

.field public final I:Lio/sentry/transport/d;

.field public final w:Ljava/util/concurrent/atomic/AtomicLong;

.field public final x:J

.field public y:Lio/sentry/o;

.field public final z:Lio/sentry/util/f;


# direct methods
.method public constructor <init>(JZZ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lio/sentry/android/core/u0;->w:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Lio/sentry/util/f;

    new-instance v1, Li5/c;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v0, p0, Lio/sentry/android/core/u0;->z:Lio/sentry/util/f;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/u0;->E:Lio/sentry/util/a;

    iput-wide p1, p0, Lio/sentry/android/core/u0;->x:J

    iput-boolean p3, p0, Lio/sentry/android/core/u0;->G:Z

    iput-boolean p4, p0, Lio/sentry/android/core/u0;->H:Z

    sget-object p1, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object p1, p0, Lio/sentry/android/core/u0;->F:Lio/sentry/i4;

    sget-object p1, Lio/sentry/transport/d;->w:Lio/sentry/transport/d;

    iput-object p1, p0, Lio/sentry/android/core/u0;->I:Lio/sentry/transport/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lio/sentry/android/core/u0;->H:Z

    if-eqz v0, :cond_0

    new-instance v0, Lio/sentry/e;

    invoke-direct {v0}, Lio/sentry/e;-><init>()V

    const-string v1, "navigation"

    iput-object v1, v0, Lio/sentry/e;->E:Ljava/lang/String;

    const-string v1, "state"

    invoke-virtual {v0, p1, v1}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "app.lifecycle"

    iput-object p1, v0, Lio/sentry/e;->G:Ljava/lang/String;

    sget-object p1, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    iput-object p1, v0, Lio/sentry/e;->I:Lio/sentry/n5;

    iget-object p1, p0, Lio/sentry/android/core/u0;->F:Lio/sentry/i4;

    invoke-virtual {p1, v0}, Lio/sentry/i4;->h(Lio/sentry/e;)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/u0;->E:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/u0;->y:Lio/sentry/o;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/android/core/u0;->y:Lio/sentry/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public final i()V
    .locals 8

    invoke-virtual {p0}, Lio/sentry/android/core/u0;->b()V

    iget-object v0, p0, Lio/sentry/android/core/u0;->I:Lio/sentry/transport/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    new-instance v2, Lcom/whoop/data/repositories/c;

    const/4 v3, 0x6

    invoke-direct {v2, p0, v3}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    iget-object v3, p0, Lio/sentry/android/core/u0;->F:Lio/sentry/i4;

    invoke-virtual {v3, v2}, Lio/sentry/i4;->s(Lio/sentry/e4;)V

    iget-object v2, p0, Lio/sentry/android/core/u0;->w:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_0

    iget-wide v6, p0, Lio/sentry/android/core/u0;->x:J

    add-long/2addr v4, v6

    cmp-long v4, v4, v0

    if-gtz v4, :cond_2

    :cond_0
    iget-boolean v4, p0, Lio/sentry/android/core/u0;->G:Z

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lio/sentry/i4;->u()V

    :cond_1
    invoke-virtual {v3}, Lio/sentry/i4;->l()Lio/sentry/q6;

    move-result-object v4

    invoke-virtual {v4}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v4

    invoke-interface {v4}, Lio/sentry/v3;->x()V

    :cond_2
    invoke-virtual {v3}, Lio/sentry/i4;->l()Lio/sentry/q6;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v3

    invoke-interface {v3}, Lio/sentry/v3;->resume()V

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    const-string v0, "foreground"

    invoke-virtual {p0, v0}, Lio/sentry/android/core/u0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final k()V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/u0;->I:Lio/sentry/transport/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lio/sentry/android/core/u0;->w:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    iget-object v0, p0, Lio/sentry/android/core/u0;->F:Lio/sentry/i4;

    invoke-virtual {v0}, Lio/sentry/i4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/v3;->pause()V

    iget-object v0, p0, Lio/sentry/android/core/u0;->E:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, Lio/sentry/android/core/u0;->b()V

    new-instance v1, Lio/sentry/o;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/sentry/o;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lio/sentry/android/core/u0;->y:Lio/sentry/o;

    iget-object v1, p0, Lio/sentry/android/core/u0;->z:Lio/sentry/util/f;

    invoke-virtual {v1}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Timer;

    iget-object v2, p0, Lio/sentry/android/core/u0;->y:Lio/sentry/o;

    iget-wide v3, p0, Lio/sentry/android/core/u0;->x:J

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    const-string v0, "background"

    invoke-virtual {p0, v0}, Lio/sentry/android/core/u0;->a(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method
