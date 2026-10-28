.class public final Lch3/e0;
.super Lxg3/s;
.source "SourceFile"


# static fields
.field public static final J:I


# instance fields
.field public final E:Lch3/g0;

.field public final F:J

.field public volatile G:Z

.field public volatile H:Lgh3/g;

.field public I:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lgh3/g;->x:I

    div-int/lit8 v0, v0, 0x4

    sput v0, Lch3/e0;->J:I

    return-void
.end method

.method public constructor <init>(Lch3/g0;J)V
    .locals 0

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lch3/e0;->E:Lch3/g0;

    iput-wide p2, p0, Lch3/e0;->F:J

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    sget v0, Lgh3/g;->x:I

    iput v0, p0, Lch3/e0;->I:I

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Lxg3/s;->e(J)V

    return-void
.end method

.method public final onCompleted()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/e0;->G:Z

    iget-object v0, p0, Lch3/e0;->E:Lch3/g0;

    invoke-virtual {v0}, Lch3/g0;->h()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lch3/e0;->E:Lch3/g0;

    invoke-virtual {v0}, Lch3/g0;->j()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lch3/e0;->G:Z

    iget-object p1, p0, Lch3/e0;->E:Lch3/g0;

    invoke-virtual {p1}, Lch3/g0;->h()V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lch3/e0;->E:Lch3/g0;

    iget-object v1, v0, Lch3/g0;->H:Lch3/f0;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lch3/g0;->H:Lch3/f0;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    iget-boolean v5, v0, Lch3/g0;->M:Z

    if-nez v5, :cond_0

    cmp-long v3, v1, v3

    if-eqz v3, :cond_0

    iput-boolean v6, v0, Lch3/g0;->M:Z

    move v3, v6

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move v3, v7

    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    move v3, v7

    :goto_2
    if-eqz v3, :cond_a

    iget-object v3, p0, Lch3/e0;->H:Lgh3/g;

    if-eqz v3, :cond_3

    iget-object v3, v3, Lgh3/g;->w:Ljava/util/AbstractQueue;

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-static {p0, p1}, Lch3/g0;->k(Lch3/e0;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lch3/g0;->i()V

    return-void

    :cond_3
    :goto_3
    :try_start_1
    iget-object v3, v0, Lch3/g0;->E:Lxg3/s;

    invoke-interface {v3, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    :try_start_2
    iget-boolean v3, v0, Lch3/g0;->F:Z

    if-nez v3, :cond_4

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-virtual {p0}, Lxg3/s;->b()V

    invoke-virtual {p0, p1}, Lch3/e0;->onError(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception p1

    goto :goto_8

    :catchall_3
    move-exception p1

    move v6, v7

    goto :goto_8

    :cond_4
    :try_start_4
    invoke-virtual {v0}, Lch3/g0;->j()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    :goto_4
    const-wide v3, 0x7fffffffffffffffL

    cmp-long p1, v1, v3

    if-eqz p1, :cond_5

    iget-object p1, v0, Lch3/g0;->H:Lch3/f0;

    const/4 v1, -0x1

    int-to-long v1, v1

    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_5
    iget p1, p0, Lch3/e0;->I:I

    const-wide/16 v1, 0x1

    long-to-int v1, v1

    sub-int/2addr p1, v1

    sget v1, Lch3/e0;->J:I

    if-le p1, v1, :cond_6

    iput p1, p0, Lch3/e0;->I:I

    goto :goto_5

    :cond_6
    sget v1, Lgh3/g;->x:I

    iput v1, p0, Lch3/e0;->I:I

    sub-int/2addr v1, p1

    if-lez v1, :cond_7

    int-to-long v1, v1

    invoke-virtual {p0, v1, v2}, Lxg3/s;->e(J)V

    :cond_7
    :goto_5
    monitor-enter v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    iget-boolean p1, v0, Lch3/g0;->N:Z

    if-nez p1, :cond_8

    iput-boolean v7, v0, Lch3/g0;->M:Z

    monitor-exit v0

    goto :goto_6

    :catchall_4
    move-exception p1

    goto :goto_7

    :cond_8
    iput-boolean v7, v0, Lch3/g0;->N:Z

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    invoke-virtual {v0}, Lch3/g0;->i()V

    :goto_6
    return-void

    :goto_7
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_8
    if-nez v6, :cond_9

    monitor-enter v0

    :try_start_8
    iput-boolean v7, v0, Lch3/g0;->M:Z

    monitor-exit v0

    goto :goto_9

    :catchall_5
    move-exception p1

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    throw p1

    :cond_9
    :goto_9
    throw p1

    :cond_a
    invoke-static {p0, p1}, Lch3/g0;->k(Lch3/e0;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lch3/g0;->h()V

    return-void
.end method
