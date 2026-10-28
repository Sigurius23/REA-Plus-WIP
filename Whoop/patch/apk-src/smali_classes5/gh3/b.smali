.class public final Lgh3/b;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lxg3/i;


# instance fields
.field public w:Z

.field public volatile x:Z

.field public y:Ljava/lang/Throwable;

.field public final z:Lch3/k0;


# direct methods
.method public constructor <init>(Lch3/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lgh3/b;->z:Lch3/k0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lgh3/b;->w:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lgh3/b;->w:Z

    iget-boolean v1, p0, Lgh3/b;->x:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const/4 v4, 0x0

    :try_start_1
    iget-object v5, p0, Lgh3/b;->z:Lch3/k0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    :goto_0
    move v6, v4

    :goto_1
    const-wide/16 v7, 0x0

    cmp-long v9, v2, v7

    if-gtz v9, :cond_1

    if-eqz v1, :cond_6

    :cond_1
    if-eqz v1, :cond_4

    :try_start_2
    iget-object v10, v5, Lch3/k0;->E:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v10}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    move-result-object v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-nez v10, :cond_3

    :try_start_3
    iget-object v1, p0, Lgh3/b;->y:Ljava/lang/Throwable;

    iget-object v2, v5, Lch3/k0;->G:Lxg3/s;

    if-eqz v1, :cond_2

    invoke-interface {v2, v1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    invoke-interface {v2}, Lxg3/h;->onCompleted()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :catchall_1
    move-exception v1

    goto/16 :goto_a

    :cond_3
    if-nez v9, :cond_4

    goto :goto_4

    :catchall_2
    move-exception v0

    :goto_2
    move-object v1, v0

    :goto_3
    move v0, v4

    goto/16 :goto_a

    :cond_4
    :try_start_4
    iget-object v9, v5, Lch3/k0;->E:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v9

    iget-object v10, v5, Lch3/k0;->F:Ljava/util/concurrent/atomic/AtomicLong;

    if-eqz v10, :cond_5

    if-eqz v9, :cond_5

    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    :cond_5
    if-nez v9, :cond_d

    :cond_6
    :goto_4
    :try_start_5
    monitor-enter p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    :try_start_6
    iget-boolean v1, p0, Lgh3/b;->x:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    iget-object v2, v5, Lch3/k0;->E:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    if-eqz v2, :cond_7

    move v2, v0

    goto :goto_5

    :cond_7
    move v2, v4

    :goto_5
    :try_start_8
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    const-wide v11, 0x7fffffffffffffffL

    cmp-long v3, v9, v11

    if-nez v3, :cond_9

    if-nez v2, :cond_8

    if-nez v1, :cond_8

    :try_start_9
    iput-boolean v4, p0, Lgh3/b;->w:Z

    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    return-void

    :catchall_3
    move-exception v1

    goto :goto_9

    :cond_8
    move-wide v2, v11

    goto :goto_6

    :cond_9
    neg-int v3, v6

    int-to-long v9, v3

    :try_start_a
    invoke-virtual {p0, v9, v10}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v9

    cmp-long v3, v9, v7

    if-eqz v3, :cond_a

    if-nez v2, :cond_b

    :cond_a
    if-eqz v1, :cond_c

    if-eqz v2, :cond_b

    goto :goto_8

    :cond_b
    move-wide v2, v9

    :goto_6
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_0

    :catchall_4
    move-exception v1

    :goto_7
    move v0, v4

    goto :goto_9

    :cond_c
    :goto_8
    :try_start_b
    iput-boolean v4, p0, Lgh3/b;->w:Z

    monitor-exit p0

    return-void

    :catchall_5
    move-exception v0

    move-object v1, v0

    goto :goto_7

    :goto_9
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    :catchall_6
    move-exception v1

    goto :goto_3

    :cond_d
    :try_start_d
    iget-object v7, v5, Lch3/k0;->G:Lxg3/s;

    invoke-static {v7, v9}, Lch3/d;->a(Lxg3/h;Ljava/lang/Object;)Z

    move-result v7
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    if-eqz v7, :cond_e

    return-void

    :cond_e
    const-wide/16 v7, 0x1

    sub-long/2addr v2, v7

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1

    :catchall_7
    move-exception v0

    goto :goto_2

    :goto_a
    if-nez v0, :cond_f

    monitor-enter p0

    :try_start_e
    iput-boolean v4, p0, Lgh3/b;->w:Z

    monitor-exit p0

    goto :goto_b

    :catchall_8
    move-exception v0

    monitor-exit p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    throw v0

    :cond_f
    :goto_b
    throw v1

    :goto_c
    :try_start_f
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    throw v0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lgh3/b;->x:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lgh3/b;->y:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lgh3/b;->x:Z

    invoke-virtual {p0}, Lgh3/b;->a()V

    :cond_0
    return-void
.end method

.method public final request(J)V
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_4

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    cmp-long v4, v2, v0

    const/4 v5, 0x1

    if-nez v4, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    const-wide v6, 0x7fffffffffffffffL

    cmp-long v8, v2, v6

    if-nez v8, :cond_2

    goto :goto_3

    :cond_2
    cmp-long v8, p1, v6

    if-nez v8, :cond_3

    move-wide v6, p1

    goto :goto_2

    :cond_3
    sub-long v8, v6, p1

    cmp-long v5, v2, v8

    if-lez v5, :cond_4

    :goto_1
    move v5, v4

    goto :goto_2

    :cond_4
    add-long v6, v2, p1

    goto :goto_1

    :goto_2
    invoke-virtual {p0, v2, v3, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v2

    if-eqz v2, :cond_0

    move v4, v5

    :goto_3
    if-eqz v4, :cond_5

    invoke-virtual {p0}, Lgh3/b;->a()V

    :cond_5
    :goto_4
    return-void
.end method
