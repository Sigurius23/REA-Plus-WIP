.class public final Lio/sentry/android/replay/capture/f;
.super Lio/sentry/android/replay/capture/c;
.source "SourceFile"


# instance fields
.field public final r:Lio/sentry/q6;

.field public final s:Lio/sentry/d1;

.field public final t:Lio/sentry/transport/f;

.field public final u:Lio/sentry/util/j;

.field public final v:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lio/sentry/q6;Lio/sentry/i4;Lio/sentry/transport/d;Lio/sentry/util/j;Lio/sentry/android/replay/util/d;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p5}, Lio/sentry/android/replay/capture/c;-><init>(Lio/sentry/q6;Lio/sentry/d1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/f;->r:Lio/sentry/q6;

    iput-object p2, p0, Lio/sentry/android/replay/capture/f;->s:Lio/sentry/d1;

    iput-object p3, p0, Lio/sentry/android/replay/capture/f;->t:Lio/sentry/transport/f;

    iput-object p4, p0, Lio/sentry/android/replay/capture/f;->u:Lio/sentry/util/j;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/f;->v:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/android/replay/w;)V
    .locals 2

    new-instance v0, Lio/sentry/android/replay/capture/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/e;-><init>(Lio/sentry/android/replay/capture/f;I)V

    const-string v1, "configuration_changed"

    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/f;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/c;->l(Lio/sentry/android/replay/w;)V

    return-void
.end method

.method public final b()Lio/sentry/android/replay/capture/l;
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    iget-object v1, p0, Lio/sentry/android/replay/capture/f;->r:Lio/sentry/q6;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Not converting to session mode, because the process is about to terminate"

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p0

    :cond_0
    new-instance v0, Lio/sentry/android/replay/capture/o;

    iget-object v2, p0, Lio/sentry/android/replay/capture/f;->t:Lio/sentry/transport/f;

    iget-object v3, p0, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v4, p0, Lio/sentry/android/replay/capture/f;->s:Lio/sentry/d1;

    invoke-direct {v0, v1, v4, v2, v3}, Lio/sentry/android/replay/capture/o;-><init>(Lio/sentry/q6;Lio/sentry/d1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;)V

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->i()Lio/sentry/android/replay/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/android/replay/capture/c;->l(Lio/sentry/android/replay/w;)V

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->h()I

    move-result v1

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->g()Lio/sentry/protocol/v;

    move-result-object v2

    sget-object v3, Lio/sentry/r6;->BUFFER:Lio/sentry/r6;

    invoke-virtual {v0, v1, v2, v3}, Lio/sentry/android/replay/capture/o;->c(ILio/sentry/protocol/v;Lio/sentry/r6;)V

    return-object v0
.end method

.method public final d(Lc4/q;)V
    .locals 7

    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->t:Lio/sentry/transport/f;

    invoke-interface {v0}, Lio/sentry/transport/f;->c()J

    move-result-wide v4

    new-instance v0, Lio/sentry/android/replay/util/e;

    new-instance v1, Lcom/mapbox/common/module/c;

    const/4 v6, 0x4

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/mapbox/common/module/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    const-string p1, "BufferCaptureStrategy.add_frame"

    invoke-direct {v0, v1, p1}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object p1, v2, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final e(ZLa0/a1;)V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->r:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v1

    iget-object v1, v1, Lio/sentry/u6;->f:Ljava/lang/Double;

    iget-object v2, p0, Lio/sentry/android/replay/capture/f;->u:Lio/sentry/util/j;

    invoke-static {v2, v1}, Lx30/s0;->E(Lio/sentry/util/j;Ljava/lang/Double;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v0, "Replay wasn\'t sampled by onErrorSampleRate, not capturing for event"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/capture/f;->s:Lio/sentry/d1;

    if-eqz v1, :cond_1

    new-instance v3, Lhn/p;

    const/16 v4, 0x12

    invoke-direct {v3, p0, v4}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1, v3}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    :cond_1
    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v0, "Not capturing replay for crashed event, will be captured on next launch"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Lb2/z;

    const/16 v0, 0xe

    invoke-direct {p1, v0, p0, p2}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "capture_replay"

    invoke-virtual {p0, p2, p1}, Lio/sentry/android/replay/capture/f;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->i()Lio/sentry/android/replay/w;

    move-result-object v6

    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->r:Lio/sentry/q6;

    if-nez v6, :cond_0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "Recorder config is not set, not creating segment for task: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p2, v0, p1, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-wide v0, v0, Lio/sentry/u6;->i:J

    iget-object v2, p0, Lio/sentry/android/replay/capture/f;->t:Lio/sentry/transport/f;

    invoke-interface {v2}, Lio/sentry/transport/f;->c()J

    move-result-wide v2

    iget-object v4, p0, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    if-eqz v4, :cond_2

    iget-object v5, v4, Lio/sentry/android/replay/k;->F:Lio/sentry/util/a;

    invoke-virtual {v5}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v5

    :try_start_0
    iget-object v4, v4, Lio/sentry/android/replay/k;->I:Ljava/util/ArrayList;

    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/replay/l;

    const/4 v7, 0x0

    if-eqz v4, :cond_1

    iget-wide v8, v4, Lio/sentry/android/replay/l;->b:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_1
    move-object v4, v7

    :goto_0
    invoke-static {v5, v7}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_2

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    move-object p2, v0

    invoke-static {v5, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    :goto_2
    sub-long v0, v2, v0

    invoke-static {v0, v1}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v4

    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sub-long/2addr v2, v0

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->g()Lio/sentry/protocol/v;

    move-result-object v5

    new-instance v8, Lio/sentry/android/replay/util/e;

    const-string v0, "BufferCaptureStrategy."

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lio/sentry/android/replay/capture/d;

    move-object v1, p0

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/capture/d;-><init>(Lio/sentry/android/replay/capture/f;JLjava/util/Date;Lio/sentry/protocol/v;Lio/sentry/android/replay/w;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {v8, v0, p1}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object p1, v1, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v8}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)V
    .locals 4

    invoke-super {p0, p1}, Lio/sentry/android/replay/capture/c;->onTouchEvent(Landroid/view/MotionEvent;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->t:Lio/sentry/transport/f;

    invoke-interface {p1}, Lio/sentry/transport/f;->c()J

    move-result-wide v0

    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->r:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object p1

    iget-wide v2, p1, Lio/sentry/u6;->i:J

    sub-long/2addr v0, v2

    const-string p1, "events"

    iget-object v2, p0, Lio/sentry/android/replay/capture/c;->p:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string v2, "iterator(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/rrweb/b;

    iget-wide v2, v2, Lio/sentry/rrweb/b;->x:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final pause()V
    .locals 2

    new-instance v0, Lio/sentry/android/replay/capture/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/e;-><init>(Lio/sentry/android/replay/capture/f;I)V

    const-string v1, "pause"

    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/f;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final stop()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/android/replay/k;->i()Ljava/io/File;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lio/sentry/android/replay/util/e;

    new-instance v2, Lio/sentry/android/core/r0;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v0, p0}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "BufferCaptureStrategy.stop"

    invoke-direct {v1, v2, v0}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object v0, p0, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    invoke-super {p0}, Lio/sentry/android/replay/capture/c;->stop()V

    return-void
.end method
