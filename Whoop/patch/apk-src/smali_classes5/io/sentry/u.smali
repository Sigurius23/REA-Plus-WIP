.class public final Lio/sentry/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/hints/d;
.implements Lio/sentry/hints/h;
.implements Lio/sentry/hints/k;
.implements Lio/sentry/hints/f;


# instance fields
.field public final E:Lio/sentry/v0;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/util/Queue;

.field public w:Z

.field public x:Z

.field public final y:Ljava/util/concurrent/CountDownLatch;

.field public final z:J


# direct methods
.method public constructor <init>(JLio/sentry/v0;Ljava/lang/String;Lio/sentry/j7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/u;->w:Z

    iput-boolean v0, p0, Lio/sentry/u;->x:Z

    iput-wide p1, p0, Lio/sentry/u;->z:J

    iput-object p4, p0, Lio/sentry/u;->F:Ljava/lang/String;

    iput-object p5, p0, Lio/sentry/u;->G:Ljava/util/Queue;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lio/sentry/u;->y:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lio/sentry/u;->E:Lio/sentry/v0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/u;->w:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/u;->x:Z

    return v0
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/u;->x:Z

    iget-object p1, p0, Lio/sentry/u;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/u;->w:Z

    return-void
.end method

.method public final e()Z
    .locals 4

    :try_start_0
    iget-object v0, p0, Lio/sentry/u;->y:Ljava/util/concurrent/CountDownLatch;

    iget-wide v1, p0, Lio/sentry/u;->z:J

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

    const-string v2, "Exception while awaiting on lock."

    iget-object v3, p0, Lio/sentry/u;->E:Lio/sentry/v0;

    invoke-interface {v3, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method
