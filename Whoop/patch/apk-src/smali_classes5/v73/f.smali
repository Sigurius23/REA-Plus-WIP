.class public final Lv73/f;
.super La83/a;
.source "SourceFile"

# interfaces
.implements Ll73/b;


# instance fields
.field public volatile E:Z

.field public volatile F:Z

.field public G:Ljava/lang/Throwable;

.field public final H:Ljava/util/concurrent/atomic/AtomicLong;

.field public I:Z

.field public final w:Ll73/b;

.field public final x:Ls73/d;

.field public final y:Lp73/a;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll73/b;IZLjc/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lv73/f;->H:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p1, p0, Lv73/f;->w:Ll73/b;

    iput-object p4, p0, Lv73/f;->y:Lp73/a;

    if-eqz p3, :cond_0

    new-instance p1, Lx73/b;

    invoke-direct {p1, p2}, Lx73/b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Lx73/a;

    invoke-direct {p1, p2}, Lx73/a;-><init>(I)V

    :goto_0
    iput-object p1, p0, Lv73/f;->x:Ls73/d;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv73/f;->I:Z

    const/4 v0, 0x2

    return v0
.end method

.method public final b(Leg3/b;)V
    .locals 2

    iget-object v0, p0, Lv73/f;->z:Ljava/lang/Object;

    invoke-static {v0, p1}, La83/c;->c(Leg3/b;Leg3/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lv73/f;->z:Ljava/lang/Object;

    iget-object v0, p0, Lv73/f;->w:Ll73/b;

    invoke-interface {v0, p0}, Leg3/a;->b(Leg3/b;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Leg3/b;->request(J)V

    :cond_0
    return-void
.end method

.method public final c(ZZLeg3/a;)Z
    .locals 2

    iget-boolean v0, p0, Lv73/f;->E:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lv73/f;->x:Ls73/d;

    invoke-interface {p1}, Ls73/e;->clear()V

    return v1

    :cond_0
    if-eqz p1, :cond_2

    iget-object p1, p0, Lv73/f;->G:Ljava/lang/Throwable;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lv73/f;->x:Ls73/d;

    invoke-interface {p2}, Ls73/e;->clear()V

    invoke-interface {p3, p1}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {p3}, Leg3/a;->onComplete()V

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final cancel()V
    .locals 1

    iget-boolean v0, p0, Lv73/f;->E:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv73/f;->E:Z

    iget-object v0, p0, Lv73/f;->z:Ljava/lang/Object;

    invoke-interface {v0}, Leg3/b;->cancel()V

    iget-boolean v0, p0, Lv73/f;->I:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lv73/f;->x:Ls73/d;

    invoke-interface {v0}, Ls73/e;->clear()V

    :cond_0
    return-void
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lv73/f;->x:Ls73/d;

    invoke-interface {v0}, Ls73/e;->clear()V

    return-void
.end method

.method public final d()V
    .locals 14

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lv73/f;->x:Ls73/d;

    iget-object v1, p0, Lv73/f;->w:Ll73/b;

    const/4 v2, 0x1

    move v3, v2

    :cond_0
    iget-boolean v4, p0, Lv73/f;->F:Z

    invoke-interface {v0}, Ls73/e;->isEmpty()Z

    move-result v5

    invoke-virtual {p0, v4, v5, v1}, Lv73/f;->c(ZZLeg3/a;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_3

    :cond_1
    iget-object v4, p0, Lv73/f;->H:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    move-wide v8, v6

    :goto_0
    cmp-long v10, v8, v4

    if-eqz v10, :cond_5

    iget-boolean v11, p0, Lv73/f;->F:Z

    invoke-interface {v0}, Ls73/e;->poll()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_2

    move v13, v2

    goto :goto_1

    :cond_2
    const/4 v13, 0x0

    :goto_1
    invoke-virtual {p0, v11, v13, v1}, Lv73/f;->c(ZZLeg3/a;)Z

    move-result v11

    if-eqz v11, :cond_3

    goto :goto_3

    :cond_3
    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v1, v12}, Leg3/a;->onNext(Ljava/lang/Object;)V

    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    goto :goto_0

    :cond_5
    :goto_2
    if-nez v10, :cond_6

    iget-boolean v10, p0, Lv73/f;->F:Z

    invoke-interface {v0}, Ls73/e;->isEmpty()Z

    move-result v11

    invoke-virtual {p0, v10, v11, v1}, Lv73/f;->c(ZZLeg3/a;)Z

    move-result v10

    if-eqz v10, :cond_6

    goto :goto_3

    :cond_6
    cmp-long v6, v8, v6

    if-eqz v6, :cond_7

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v4, v4, v6

    if-eqz v4, :cond_7

    iget-object v4, p0, Lv73/f;->H:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v5, v8

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_7
    neg-int v3, v3

    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v3

    if-nez v3, :cond_0

    :cond_8
    :goto_3
    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lv73/f;->x:Ls73/d;

    invoke-interface {v0}, Ls73/e;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv73/f;->F:Z

    iget-boolean v0, p0, Lv73/f;->I:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv73/f;->w:Ll73/b;

    invoke-interface {v0}, Leg3/a;->onComplete()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lv73/f;->d()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iput-object p1, p0, Lv73/f;->G:Ljava/lang/Throwable;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv73/f;->F:Z

    iget-boolean v0, p0, Lv73/f;->I:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv73/f;->w:Ll73/b;

    invoke-interface {v0, p1}, Leg3/a;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lv73/f;->d()V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lv73/f;->x:Ls73/d;

    invoke-interface {v0, p1}, Ls73/e;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lv73/f;->z:Ljava/lang/Object;

    invoke-interface {p1}, Leg3/b;->cancel()V

    new-instance p1, Lio/reactivex/exceptions/MissingBackpressureException;

    const-string v0, "Buffer is full"

    invoke-direct {p1, v0}, Lio/reactivex/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lv73/f;->y:Lp73/a;

    invoke-interface {v0}, Lp73/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :goto_0
    invoke-virtual {p0, p1}, Lv73/f;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-boolean p1, p0, Lv73/f;->I:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv73/f;->w:Ll73/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Leg3/a;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lv73/f;->d()V

    return-void
.end method

.method public final poll()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv73/f;->x:Ls73/d;

    invoke-interface {v0}, Ls73/e;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final request(J)V
    .locals 1

    iget-boolean v0, p0, Lv73/f;->I:Z

    if-nez v0, :cond_0

    invoke-static {p1, p2}, La83/c;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv73/f;->H:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lhg3/i;->p(Ljava/util/concurrent/atomic/AtomicLong;J)V

    invoke-virtual {p0}, Lv73/f;->d()V

    :cond_0
    return-void
.end method
