.class public final Lio/sentry/android/replay/capture/o;
.super Lio/sentry/android/replay/capture/c;
.source "SourceFile"


# instance fields
.field public final r:Lio/sentry/q6;

.field public final s:Lio/sentry/d1;

.field public final t:Lio/sentry/transport/f;


# direct methods
.method public constructor <init>(Lio/sentry/q6;Lio/sentry/d1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lio/sentry/android/replay/capture/c;-><init>(Lio/sentry/q6;Lio/sentry/d1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/o;->r:Lio/sentry/q6;

    iput-object p2, p0, Lio/sentry/android/replay/capture/o;->s:Lio/sentry/d1;

    iput-object p3, p0, Lio/sentry/android/replay/capture/o;->t:Lio/sentry/transport/f;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/android/replay/w;)V
    .locals 2

    new-instance v0, Lio/sentry/android/replay/capture/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/n;-><init>(Lio/sentry/android/replay/capture/o;I)V

    const-string v1, "onConfigurationChanged"

    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/o;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/c;->l(Lio/sentry/android/replay/w;)V

    return-void
.end method

.method public final b()Lio/sentry/android/replay/capture/l;
    .locals 0

    return-object p0
.end method

.method public final c(ILio/sentry/protocol/v;Lio/sentry/r6;)V
    .locals 1

    const-string v0, "replayId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lio/sentry/android/replay/capture/c;->c(ILio/sentry/protocol/v;Lio/sentry/r6;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/o;->s:Lio/sentry/d1;

    if-eqz p1, :cond_0

    new-instance p2, Lhn/p;

    const/16 p3, 0x13

    invoke-direct {p2, p0, p3}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, p2}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    :cond_0
    return-void
.end method

.method public final d(Lc4/q;)V
    .locals 7

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->i()Lio/sentry/android/replay/w;

    move-result-object v5

    iget-object v0, p0, Lio/sentry/android/replay/capture/o;->t:Lio/sentry/transport/f;

    invoke-interface {v0}, Lio/sentry/transport/f;->c()J

    move-result-wide v3

    new-instance v6, Lio/sentry/android/replay/util/e;

    new-instance v0, Lio/sentry/android/replay/capture/m;

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lio/sentry/android/replay/capture/m;-><init>(Lio/sentry/android/replay/capture/o;Lc4/q;JLio/sentry/android/replay/w;)V

    const-string p1, "SessionCaptureStrategy.add_frame"

    invoke-direct {v6, v0, p1}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object p1, v1, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final e(ZLa0/a1;)V
    .locals 3

    iget-object p2, p0, Lio/sentry/android/replay/capture/o;->r:Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/u6;->n:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Replay is already running in \'session\' mode, not capturing for event"

    invoke-interface {p2, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object p2, p0, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 9

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->i()Lio/sentry/android/replay/w;

    move-result-object v6

    if-nez v6, :cond_0

    iget-object p2, p0, Lio/sentry/android/replay/capture/o;->r:Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

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
    iget-object v0, p0, Lio/sentry/android/replay/capture/o;->t:Lio/sentry/transport/f;

    invoke-interface {v0}, Lio/sentry/transport/f;->c()J

    move-result-wide v0

    sget-object v2, Lio/sentry/android/replay/capture/c;->q:[Lj93/z;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    iget-object v3, p0, Lio/sentry/android/replay/capture/c;->j:Lio/sentry/android/replay/capture/b;

    invoke-virtual {v3, p0, v2}, Lio/sentry/android/replay/capture/b;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/Date;

    if-nez v4, :cond_1

    return-void

    :cond_1
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long v2, v0, v2

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->g()Lio/sentry/protocol/v;

    move-result-object v5

    new-instance v8, Lio/sentry/android/replay/util/e;

    const-string v0, "SessionCaptureStrategy."

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lio/sentry/android/replay/capture/d;

    move-object v1, p0

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/capture/d;-><init>(Lio/sentry/android/replay/capture/o;JLjava/util/Date;Lio/sentry/protocol/v;Lio/sentry/android/replay/w;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {v8, v0, p1}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object p1, v1, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v8}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final pause()V
    .locals 2

    new-instance v0, Lio/sentry/android/replay/capture/n;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/n;-><init>(Lio/sentry/android/replay/capture/o;I)V

    const-string v1, "pause"

    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/o;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final stop()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/android/replay/k;->i()Ljava/io/File;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lb2/z;

    const/16 v2, 0x10

    invoke-direct {v1, v2, p0, v0}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "stop"

    invoke-virtual {p0, v0, v1}, Lio/sentry/android/replay/capture/o;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lio/sentry/android/replay/capture/o;->s:Lio/sentry/d1;

    if-eqz v0, :cond_1

    new-instance v1, Li7/g;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Li7/g;-><init>(I)V

    invoke-interface {v0, v1}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    :cond_1
    invoke-super {p0}, Lio/sentry/android/replay/capture/c;->stop()V

    return-void
.end method
