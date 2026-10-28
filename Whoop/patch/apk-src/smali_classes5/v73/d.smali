.class public final Lv73/d;
.super La83/a;
.source "SourceFile"

# interfaces
.implements Ll73/b;
.implements Ljava/lang/Runnable;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ls73/e;

.field public volatile G:Z

.field public volatile H:Z

.field public I:Ljava/lang/Throwable;

.field public J:I

.field public K:J

.field public L:Z

.field public final M:Ll73/b;

.field public final w:Ll73/f;

.field public final x:I

.field public final y:I

.field public final z:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Ll73/b;Ll73/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p2, p0, Lv73/d;->w:Ll73/f;

    iput p3, p0, Lv73/d;->x:I

    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p2, p0, Lv73/d;->z:Ljava/util/concurrent/atomic/AtomicLong;

    shr-int/lit8 p2, p3, 0x2

    sub-int/2addr p3, p2

    iput p3, p0, Lv73/d;->y:I

    iput-object p1, p0, Lv73/d;->M:Ll73/b;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv73/d;->L:Z

    const/4 v0, 0x2

    return v0
.end method

.method public final b(Leg3/b;)V
    .locals 3

    iget-object v0, p0, Lv73/d;->E:Ljava/lang/Object;

    invoke-static {v0, p1}, La83/c;->c(Leg3/b;Leg3/b;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lv73/d;->E:Ljava/lang/Object;

    instance-of v0, p1, Ls73/c;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ls73/c;

    invoke-interface {v0}, Ls73/b;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iput v2, p0, Lv73/d;->J:I

    iput-object v0, p0, Lv73/d;->F:Ls73/e;

    iput-boolean v2, p0, Lv73/d;->H:Z

    iget-object p1, p0, Lv73/d;->M:Ll73/b;

    invoke-interface {p1, p0}, Leg3/a;->b(Leg3/b;)V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v2, p0, Lv73/d;->J:I

    iput-object v0, p0, Lv73/d;->F:Ls73/e;

    iget-object v0, p0, Lv73/d;->M:Ll73/b;

    invoke-interface {v0, p0}, Leg3/a;->b(Leg3/b;)V

    iget v0, p0, Lv73/d;->x:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Leg3/b;->request(J)V

    return-void

    :cond_1
    new-instance v0, Lx73/a;

    iget v1, p0, Lv73/d;->x:I

    invoke-direct {v0, v1}, Lx73/a;-><init>(I)V

    iput-object v0, p0, Lv73/d;->F:Ls73/e;

    iget-object v0, p0, Lv73/d;->M:Ll73/b;

    invoke-interface {v0, p0}, Leg3/a;->b(Leg3/b;)V

    iget v0, p0, Lv73/d;->x:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Leg3/b;->request(J)V

    :cond_2
    return-void
.end method

.method public final c(ZZLeg3/a;)Z
    .locals 2

    iget-boolean v0, p0, Lv73/d;->G:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lv73/d;->clear()V

    return v1

    :cond_0
    if-eqz p1, :cond_2

    iget-object p1, p0, Lv73/d;->I:Ljava/lang/Throwable;

    if-eqz p1, :cond_1

    iput-boolean v1, p0, Lv73/d;->G:Z

    invoke-virtual {p0}, Lv73/d;->clear()V

    invoke-interface {p3, p1}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lv73/d;->w:Ll73/f;

    invoke-interface {p1}, Ln73/b;->dispose()V

    return v1

    :cond_1
    if-eqz p2, :cond_2

    iput-boolean v1, p0, Lv73/d;->G:Z

    invoke-interface {p3}, Leg3/a;->onComplete()V

    iget-object p1, p0, Lv73/d;->w:Ll73/f;

    invoke-interface {p1}, Ln73/b;->dispose()V

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final cancel()V
    .locals 1

    iget-boolean v0, p0, Lv73/d;->G:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lv73/d;->G:Z

    iget-object v0, p0, Lv73/d;->E:Ljava/lang/Object;

    invoke-interface {v0}, Leg3/b;->cancel()V

    iget-object v0, p0, Lv73/d;->w:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    iget-boolean v0, p0, Lv73/d;->L:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lv73/d;->F:Ls73/e;

    invoke-interface {v0}, Ls73/e;->clear()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lv73/d;->F:Ls73/e;

    invoke-interface {v0}, Ls73/e;->clear()V

    return-void
.end method

.method public final d()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lv73/d;->w:Ll73/f;

    invoke-virtual {v0, p0}, Ll73/f;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lv73/d;->F:Ls73/e;

    invoke-interface {v0}, Ls73/e;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final onComplete()V
    .locals 1

    iget-boolean v0, p0, Lv73/d;->H:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv73/d;->H:Z

    invoke-virtual {p0}, Lv73/d;->d()V

    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lv73/d;->H:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Lv73/d;->I:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv73/d;->H:Z

    invoke-virtual {p0}, Lv73/d;->d()V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lv73/d;->H:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lv73/d;->J:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lv73/d;->d()V

    return-void

    :cond_1
    iget-object v0, p0, Lv73/d;->F:Ls73/e;

    invoke-interface {v0, p1}, Ls73/e;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lv73/d;->E:Ljava/lang/Object;

    invoke-interface {p1}, Leg3/b;->cancel()V

    new-instance p1, Lio/reactivex/exceptions/MissingBackpressureException;

    const-string v0, "Queue is full?!"

    invoke-direct {p1, v0}, Lio/reactivex/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lv73/d;->I:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv73/d;->H:Z

    :cond_2
    invoke-virtual {p0}, Lv73/d;->d()V

    return-void
.end method

.method public final poll()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lv73/d;->F:Ls73/e;

    invoke-interface {v0}, Ls73/e;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, p0, Lv73/d;->J:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    iget-wide v1, p0, Lv73/d;->K:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iget v3, p0, Lv73/d;->y:I

    int-to-long v3, v3

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lv73/d;->K:J

    iget-object v3, p0, Lv73/d;->E:Ljava/lang/Object;

    invoke-interface {v3, v1, v2}, Leg3/b;->request(J)V

    return-object v0

    :cond_0
    iput-wide v1, p0, Lv73/d;->K:J

    :cond_1
    return-object v0
.end method

.method public final request(J)V
    .locals 1

    invoke-static {p1, p2}, La83/c;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv73/d;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lhg3/i;->p(Ljava/util/concurrent/atomic/AtomicLong;J)V

    invoke-virtual {p0}, Lv73/d;->d()V

    :cond_0
    return-void
.end method

.method public final run()V
    .locals 14

    iget-boolean v0, p0, Lv73/d;->L:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    move v0, v1

    :cond_0
    iget-boolean v2, p0, Lv73/d;->G:Z

    if-eqz v2, :cond_1

    goto/16 :goto_7

    :cond_1
    iget-boolean v2, p0, Lv73/d;->H:Z

    iget-object v3, p0, Lv73/d;->M:Ll73/b;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Leg3/a;->onNext(Ljava/lang/Object;)V

    if-eqz v2, :cond_3

    iput-boolean v1, p0, Lv73/d;->G:Z

    iget-object v0, p0, Lv73/d;->I:Ljava/lang/Throwable;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lv73/d;->M:Ll73/b;

    invoke-interface {v1, v0}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lv73/d;->M:Ll73/b;

    invoke-interface {v0}, Leg3/a;->onComplete()V

    :goto_0
    iget-object v0, p0, Lv73/d;->w:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void

    :cond_3
    neg-int v0, v0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_4
    iget v0, p0, Lv73/d;->J:I

    const-wide/16 v2, 0x1

    if-ne v0, v1, :cond_c

    iget-object v0, p0, Lv73/d;->M:Ll73/b;

    iget-object v4, p0, Lv73/d;->F:Ls73/e;

    iget-wide v5, p0, Lv73/d;->K:J

    move v7, v1

    :cond_5
    :goto_1
    iget-object v8, p0, Lv73/d;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    :goto_2
    cmp-long v10, v5, v8

    if-eqz v10, :cond_8

    :try_start_0
    invoke-interface {v4}, Ls73/e;->poll()Ljava/lang/Object;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v11, p0, Lv73/d;->G:Z

    if-eqz v11, :cond_6

    goto/16 :goto_7

    :cond_6
    if-nez v10, :cond_7

    iput-boolean v1, p0, Lv73/d;->G:Z

    invoke-interface {v0}, Leg3/a;->onComplete()V

    iget-object v0, p0, Lv73/d;->w:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    goto/16 :goto_7

    :cond_7
    invoke-interface {v0, v10}, Leg3/a;->onNext(Ljava/lang/Object;)V

    add-long/2addr v5, v2

    goto :goto_2

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    iput-boolean v1, p0, Lv73/d;->G:Z

    iget-object v1, p0, Lv73/d;->E:Ljava/lang/Object;

    invoke-interface {v1}, Leg3/b;->cancel()V

    invoke-interface {v0, v2}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lv73/d;->w:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    goto/16 :goto_7

    :cond_8
    iget-boolean v8, p0, Lv73/d;->G:Z

    if-eqz v8, :cond_9

    goto/16 :goto_7

    :cond_9
    invoke-interface {v4}, Ls73/e;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_a

    iput-boolean v1, p0, Lv73/d;->G:Z

    invoke-interface {v0}, Leg3/a;->onComplete()V

    iget-object v0, p0, Lv73/d;->w:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    goto/16 :goto_7

    :cond_a
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v8

    if-ne v7, v8, :cond_b

    iput-wide v5, p0, Lv73/d;->K:J

    neg-int v7, v7

    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v7

    if-nez v7, :cond_5

    goto/16 :goto_7

    :cond_b
    move v7, v8

    goto :goto_1

    :cond_c
    iget-object v0, p0, Lv73/d;->M:Ll73/b;

    iget-object v4, p0, Lv73/d;->F:Ls73/e;

    iget-wide v5, p0, Lv73/d;->K:J

    move v7, v1

    :cond_d
    :goto_3
    iget-object v8, p0, Lv73/d;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    :cond_e
    :goto_4
    cmp-long v10, v5, v8

    if-eqz v10, :cond_13

    iget-boolean v11, p0, Lv73/d;->H:Z

    :try_start_1
    invoke-interface {v4}, Ls73/e;->poll()Ljava/lang/Object;

    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v12, :cond_f

    move v13, v1

    goto :goto_5

    :cond_f
    const/4 v13, 0x0

    :goto_5
    invoke-virtual {p0, v11, v13, v0}, Lv73/d;->c(ZZLeg3/a;)Z

    move-result v11

    if-eqz v11, :cond_10

    goto :goto_7

    :cond_10
    if-eqz v13, :cond_11

    goto :goto_6

    :cond_11
    invoke-interface {v0, v12}, Leg3/a;->onNext(Ljava/lang/Object;)V

    add-long/2addr v5, v2

    iget v10, p0, Lv73/d;->y:I

    int-to-long v10, v10

    cmp-long v10, v5, v10

    if-nez v10, :cond_e

    const-wide v10, 0x7fffffffffffffffL

    cmp-long v10, v8, v10

    if-eqz v10, :cond_12

    iget-object v8, p0, Lv73/d;->z:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v9, v5

    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v8

    :cond_12
    iget-object v10, p0, Lv73/d;->E:Ljava/lang/Object;

    invoke-interface {v10, v5, v6}, Leg3/b;->request(J)V

    const-wide/16 v5, 0x0

    goto :goto_4

    :catchall_1
    move-exception v2

    invoke-static {v2}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    iput-boolean v1, p0, Lv73/d;->G:Z

    iget-object v1, p0, Lv73/d;->E:Ljava/lang/Object;

    invoke-interface {v1}, Leg3/b;->cancel()V

    invoke-interface {v4}, Ls73/e;->clear()V

    invoke-interface {v0, v2}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lv73/d;->w:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    goto :goto_7

    :cond_13
    :goto_6
    if-nez v10, :cond_14

    iget-boolean v8, p0, Lv73/d;->H:Z

    invoke-interface {v4}, Ls73/e;->isEmpty()Z

    move-result v9

    invoke-virtual {p0, v8, v9, v0}, Lv73/d;->c(ZZLeg3/a;)Z

    move-result v8

    if-eqz v8, :cond_14

    goto :goto_7

    :cond_14
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v8

    if-ne v7, v8, :cond_15

    iput-wide v5, p0, Lv73/d;->K:J

    neg-int v7, v7

    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v7

    if-nez v7, :cond_d

    :goto_7
    return-void

    :cond_15
    move v7, v8

    goto :goto_3
.end method
