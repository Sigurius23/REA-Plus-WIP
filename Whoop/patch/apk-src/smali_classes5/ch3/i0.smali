.class public final Lch3/i0;
.super Lxg3/s;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public final E:Lxg3/s;

.field public final F:Lxg3/j;

.field public final G:Z

.field public final H:Ljava/util/AbstractQueue;

.field public final I:I

.field public volatile J:Z

.field public final K:Ljava/util/concurrent/atomic/AtomicLong;

.field public final L:Ljava/util/concurrent/atomic/AtomicLong;

.field public M:Ljava/lang/Throwable;

.field public N:J


# direct methods
.method public constructor <init>(Lxg3/k;Lxg3/s;ZI)V
    .locals 1

    invoke-direct {p0}, Lxg3/s;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lch3/i0;->K:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lch3/i0;->L:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p2, p0, Lch3/i0;->E:Lxg3/s;

    invoke-virtual {p1}, Lxg3/k;->a()Lxg3/j;

    move-result-object p1

    iput-object p1, p0, Lch3/i0;->F:Lxg3/j;

    iput-boolean p3, p0, Lch3/i0;->G:Z

    if-lez p4, :cond_0

    goto :goto_0

    :cond_0
    sget p4, Lgh3/g;->x:I

    :goto_0
    shr-int/lit8 p1, p4, 0x2

    sub-int p1, p4, p1

    iput p1, p0, Lch3/i0;->I:I

    sget-object p1, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    if-eqz p1, :cond_1

    sget-boolean p1, Lrx/internal/util/unsafe/j;->b:Z

    if-nez p1, :cond_1

    new-instance p1, Lrx/internal/util/unsafe/d;

    invoke-direct {p1, p4}, Lrx/internal/util/unsafe/d;-><init>(I)V

    iput-object p1, p0, Lch3/i0;->H:Ljava/util/AbstractQueue;

    goto :goto_1

    :cond_1
    new-instance p1, Lhh3/b;

    invoke-direct {p1, p4}, Lhh3/b;-><init>(I)V

    iput-object p1, p0, Lch3/i0;->H:Ljava/util/AbstractQueue;

    :goto_1
    int-to-long p1, p4

    invoke-virtual {p0, p1, p2}, Lxg3/s;->e(J)V

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 19

    move-object/from16 v0, p0

    iget-wide v1, v0, Lch3/i0;->N:J

    iget-object v3, v0, Lch3/i0;->H:Ljava/util/AbstractQueue;

    iget-object v4, v0, Lch3/i0;->E:Lxg3/s;

    const-wide/16 v7, 0x1

    :cond_0
    iget-object v9, v0, Lch3/i0;->K:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v9

    :cond_1
    :goto_0
    cmp-long v11, v9, v1

    const-wide/16 v12, 0x0

    if-eqz v11, :cond_5

    iget-boolean v14, v0, Lch3/i0;->J:Z

    invoke-interface {v3}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v15

    if-nez v15, :cond_2

    const/16 v16, 0x1

    :goto_1
    move/from16 v5, v16

    const-wide/16 v17, 0x1

    goto :goto_2

    :cond_2
    const/16 v16, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {v0, v14, v5, v4, v3}, Lch3/i0;->g(ZZLxg3/s;Ljava/util/AbstractQueue;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_4

    :cond_3
    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v15}, Lch3/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    add-long v1, v1, v17

    iget v5, v0, Lch3/i0;->I:I

    int-to-long v5, v5

    cmp-long v5, v1, v5

    if-nez v5, :cond_1

    iget-object v5, v0, Lch3/i0;->K:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v5, v1, v2}, Lch3/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v5

    invoke-virtual {v0, v1, v2}, Lxg3/s;->e(J)V

    move-wide v9, v5

    move-wide v1, v12

    goto :goto_0

    :cond_5
    const-wide/16 v17, 0x1

    :goto_3
    if-nez v11, :cond_6

    iget-boolean v5, v0, Lch3/i0;->J:Z

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    invoke-virtual {v0, v5, v6, v4, v3}, Lch3/i0;->g(ZZLxg3/s;Ljava/util/AbstractQueue;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_4

    :cond_6
    iput-wide v1, v0, Lch3/i0;->N:J

    iget-object v5, v0, Lch3/i0;->L:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v6, v7

    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v7

    cmp-long v5, v7, v12

    if-nez v5, :cond_0

    :goto_4
    return-void
.end method

.method public final g(ZZLxg3/s;Ljava/util/AbstractQueue;)Z
    .locals 2

    invoke-virtual {p3}, Lxg3/s;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p4}, Ljava/util/Collection;->clear()V

    return v1

    :cond_0
    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lch3/i0;->G:Z

    iget-object v0, p0, Lch3/i0;->F:Lxg3/j;

    if-eqz p1, :cond_2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lch3/i0;->M:Ljava/lang/Throwable;

    if-eqz p1, :cond_1

    :try_start_0
    invoke-interface {p3, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-interface {p3}, Lxg3/h;->onCompleted()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {v0}, Lxg3/t;->b()V

    goto :goto_2

    :goto_1
    invoke-interface {v0}, Lxg3/t;->b()V

    throw p1

    :cond_2
    iget-object p1, p0, Lch3/i0;->M:Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    invoke-interface {p4}, Ljava/util/Collection;->clear()V

    :try_start_1
    invoke-interface {p3, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v0}, Lxg3/t;->b()V

    return v1

    :catchall_1
    move-exception p1

    invoke-interface {v0}, Lxg3/t;->b()V

    throw p1

    :cond_3
    if-eqz p2, :cond_4

    :try_start_2
    invoke-interface {p3}, Lxg3/h;->onCompleted()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-interface {v0}, Lxg3/t;->b()V

    return v1

    :catchall_2
    move-exception p1

    invoke-interface {v0}, Lxg3/t;->b()V

    throw p1

    :cond_4
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Lch3/i0;->L:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lch3/i0;->F:Lxg3/j;

    invoke-virtual {v0, p0}, Lxg3/j;->c(Lbh3/a;)Lxg3/t;

    :cond_0
    return-void
.end method

.method public final onCompleted()V
    .locals 1

    invoke-virtual {p0}, Lxg3/s;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lch3/i0;->J:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/i0;->J:Z

    invoke-virtual {p0}, Lch3/i0;->h()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lxg3/s;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lch3/i0;->J:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lch3/i0;->M:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lch3/i0;->J:Z

    invoke-virtual {p0}, Lch3/i0;->h()V

    return-void

    :cond_1
    :goto_0
    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lxg3/s;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lch3/i0;->J:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lch3/i0;->H:Ljava/util/AbstractQueue;

    if-nez p1, :cond_1

    sget-object p1, Lch3/d;->b:Lch3/b;

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    new-instance p1, Lrx/exceptions/MissingBackpressureException;

    invoke-direct {p1}, Lrx/exceptions/MissingBackpressureException;-><init>()V

    invoke-virtual {p0, p1}, Lch3/i0;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lch3/i0;->h()V

    :cond_3
    :goto_0
    return-void
.end method
