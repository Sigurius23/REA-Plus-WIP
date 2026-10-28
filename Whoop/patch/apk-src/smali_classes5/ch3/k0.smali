.class public final Lch3/k0;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final E:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final F:Ljava/util/concurrent/atomic/AtomicLong;

.field public final G:Lxg3/s;

.field public final H:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final I:Lgh3/b;

.field public final J:Lbh3/a;

.field public final K:Lxg3/b;


# direct methods
.method public constructor <init>(Lxg3/s;Ljava/lang/Long;Lbh3/a;Lxg3/b;)V
    .locals 2

    invoke-direct {p0}, Lxg3/s;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lch3/k0;->E:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lch3/k0;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lch3/k0;->G:Lxg3/s;

    if-eqz p2, :cond_0

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lch3/k0;->F:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p3, p0, Lch3/k0;->J:Lbh3/a;

    new-instance p1, Lgh3/b;

    invoke-direct {p1, p0}, Lgh3/b;-><init>(Lch3/k0;)V

    iput-object p1, p0, Lch3/k0;->I:Lgh3/b;

    iput-object p4, p0, Lch3/k0;->K:Lxg3/b;

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lxg3/s;->e(J)V

    return-void
.end method

.method public final onCompleted()V
    .locals 2

    iget-object v0, p0, Lch3/k0;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lch3/k0;->I:Lgh3/b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lgh3/b;->x:Z

    invoke-virtual {v0}, Lgh3/b;->a()V

    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lch3/k0;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lch3/k0;->I:Lgh3/b;

    invoke-virtual {v0, p1}, Lgh3/b;->b(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 9

    iget-object v0, p0, Lch3/k0;->E:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iget-object v1, p0, Lch3/k0;->I:Lgh3/b;

    iget-object v2, p0, Lch3/k0;->F:Ljava/util/concurrent/atomic/AtomicLong;

    if-nez v2, :cond_0

    goto :goto_4

    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-gtz v5, :cond_5

    const/4 v5, 0x1

    const/4 v6, 0x0

    :try_start_0
    iget-object v7, p0, Lch3/k0;->K:Lxg3/b;

    invoke-interface {v7}, Lxg3/b;->a()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v7

    if-eqz v2, :cond_1

    if-eqz v7, :cond_1

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J
    :try_end_0
    .catch Lrx/exceptions/MissingBackpressureException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    if-eqz v7, :cond_2

    goto :goto_0

    :cond_2
    move v5, v6

    :goto_0
    move v6, v5

    goto :goto_1

    :catch_0
    move-exception v7

    iget-object v8, p0, Lch3/k0;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v8, v6, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p0}, Lxg3/s;->b()V

    iget-object v5, p0, Lch3/k0;->G:Lxg3/s;

    invoke-interface {v5, v7}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    iget-object v5, p0, Lch3/k0;->J:Lbh3/a;

    if-eqz v5, :cond_4

    :try_start_1
    invoke-interface {v5}, Lbh3/a;->call()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-virtual {v1, p1}, Lgh3/b;->b(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    :goto_2
    if-nez v6, :cond_5

    :goto_3
    return-void

    :cond_5
    const-wide/16 v5, 0x1

    sub-long v5, v3, v5

    invoke-virtual {v2, v3, v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_4
    if-nez p1, :cond_6

    sget-object p1, Lch3/d;->b:Lch3/b;

    :cond_6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lgh3/b;->a()V

    return-void
.end method
