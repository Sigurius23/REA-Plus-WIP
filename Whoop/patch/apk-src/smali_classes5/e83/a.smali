.class public final Le83/a;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Leg3/b;
.implements Lb83/a;


# instance fields
.field public E:Lab/h0;

.field public F:Z

.field public volatile G:Z

.field public H:J

.field public final w:Ll73/b;

.field public final x:Le83/b;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Ll73/b;Le83/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Le83/a;->w:Ll73/b;

    iput-object p2, p0, Le83/a;->x:Le83/b;

    return-void
.end method


# virtual methods
.method public final a(JLjava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Le83/a;->G:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Le83/a;->F:Z

    if-nez v0, :cond_5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le83/a;->G:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Le83/a;->H:J

    cmp-long p1, v0, p1

    if-nez p1, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    iget-boolean p1, p0, Le83/a;->z:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Le83/a;->E:Lab/h0;

    if-nez p1, :cond_3

    new-instance p1, Lab/h0;

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lab/h0;-><init>(IB)V

    iput-object p1, p0, Le83/a;->E:Lab/h0;

    :cond_3
    invoke-virtual {p1, p3}, Lab/h0;->f(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_4
    const/4 p1, 0x1

    iput-boolean p1, p0, Le83/a;->y:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean p1, p0, Le83/a;->F:Z

    goto :goto_1

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_5
    :goto_1
    invoke-virtual {p0, p3}, Le83/a;->test(Ljava/lang/Object;)Z

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-boolean v0, p0, Le83/a;->G:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Le83/a;->G:Z

    iget-object v0, p0, Le83/a;->x:Le83/b;

    invoke-virtual {v0, p0}, Le83/b;->d(Le83/a;)V

    :cond_0
    return-void
.end method

.method public final request(J)V
    .locals 1

    invoke-static {p1, p2}, La83/c;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lhg3/i;->p(Ljava/util/concurrent/atomic/AtomicLong;J)V

    :cond_0
    return-void
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 6

    iget-boolean v0, p0, Le83/a;->G:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lb83/h;->w:Lb83/h;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Le83/a;->w:Ll73/b;

    invoke-interface {p1}, Leg3/a;->onComplete()V

    return v1

    :cond_1
    instance-of v0, p1, Lb83/f;

    if-eqz v0, :cond_2

    iget-object v0, p0, Le83/a;->w:Ll73/b;

    check-cast p1, Lb83/f;

    iget-object p1, p1, Lb83/f;->w:Ljava/lang/Throwable;

    invoke-interface {v0, p1}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_4

    iget-object v0, p0, Le83/a;->w:Ll73/b;

    invoke-interface {v0, p1}, Leg3/a;->onNext(Ljava/lang/Object;)V

    const-wide v0, 0x7fffffffffffffffL

    cmp-long p1, v2, v0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    invoke-virtual {p0}, Le83/a;->cancel()V

    iget-object p1, p0, Le83/a;->w:Ll73/b;

    new-instance v0, Lio/reactivex/exceptions/MissingBackpressureException;

    const-string v2, "Could not deliver value due to lack of requests"

    invoke-direct {v0, v2}, Lio/reactivex/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    return v1
.end method
