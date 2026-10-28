.class public final Llh3/c;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lxg3/i;
.implements Lxg3/t;
.implements Lxg3/h;


# instance fields
.field public final w:Llh3/d;

.field public final x:Lxg3/s;

.field public y:J


# direct methods
.method public constructor <init>(Llh3/d;Lxg3/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Llh3/c;->w:Llh3/d;

    iput-object p2, p0, Llh3/c;->x:Lxg3/s;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 4

    const-wide/high16 v0, -0x8000000000000000L

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llh3/c;->w:Llh3/d;

    invoke-virtual {v0, p0}, Llh3/d;->a(Llh3/c;)V

    :cond_0
    return-void
.end method

.method public final onCompleted()V
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Llh3/c;->x:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Llh3/c;->x:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 6

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Llh3/c;->y:J

    cmp-long v0, v0, v2

    iget-object v1, p0, Llh3/c;->x:Lxg3/s;

    if-eqz v0, :cond_0

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Llh3/c;->y:J

    invoke-interface {v1, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Llh3/c;->b()V

    new-instance p1, Lrx/exceptions/MissingBackpressureException;

    const-string v0, "PublishSubject: could not emit value due to lack of requests"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final request(J)V
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_4

    if-eqz v2, :cond_3

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v4, v2, v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    add-long v4, v2, p1

    cmp-long v6, v4, v0

    if-gez v6, :cond_2

    const-wide v4, 0x7fffffffffffffffL

    :cond_2
    invoke-virtual {p0, v2, v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    :goto_0
    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "n >= 0 required but it was "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
