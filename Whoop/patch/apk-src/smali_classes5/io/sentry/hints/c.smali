.class public abstract Lio/sentry/hints/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/hints/f;


# instance fields
.field public final w:Ljava/util/concurrent/CountDownLatch;

.field public final x:J

.field public final y:Lio/sentry/v0;


# direct methods
.method public constructor <init>(JLio/sentry/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lio/sentry/hints/c;->x:J

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lio/sentry/hints/c;->w:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lio/sentry/hints/c;->y:Lio/sentry/v0;

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 4

    :try_start_0
    iget-object v0, p0, Lio/sentry/hints/c;->w:Ljava/util/concurrent/CountDownLatch;

    iget-wide v1, p0, Lio/sentry/hints/c;->x:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Exception while awaiting for flush in BlockingFlushHint"

    iget-object v3, p0, Lio/sentry/hints/c;->y:Lio/sentry/v0;

    invoke-interface {v3, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method

.method public abstract f(Lio/sentry/protocol/v;)Z
.end method

.method public abstract g(Lio/sentry/protocol/v;)V
.end method
