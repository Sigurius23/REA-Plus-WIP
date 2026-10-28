.class public final Lch3/j;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final E:Lch3/o0;

.field public final F:Lbh3/g;

.field public final G:Ldh3/a;

.field public final H:Ljava/util/AbstractQueue;

.field public final I:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final J:Ljava/util/concurrent/atomic/AtomicReference;

.field public final K:Lmh3/b;

.field public volatile L:Z

.field public volatile M:Z


# direct methods
.method public constructor <init>(Lch3/o0;Lbh3/g;)V
    .locals 1

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lch3/j;->E:Lch3/o0;

    iput-object p2, p0, Lch3/j;->F:Lbh3/g;

    new-instance p1, Ldh3/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch3/j;->G:Ldh3/a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lch3/j;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lch3/j;->J:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p1, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    const/4 p2, 0x2

    if-eqz p1, :cond_0

    sget-boolean p1, Lrx/internal/util/unsafe/j;->b:Z

    if-nez p1, :cond_0

    new-instance p1, Lrx/internal/util/unsafe/d;

    invoke-direct {p1, p2}, Lrx/internal/util/unsafe/d;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Lhh3/b;

    invoke-direct {p1, p2}, Lhh3/b;-><init>(I)V

    :goto_0
    iput-object p1, p0, Lch3/j;->H:Ljava/util/AbstractQueue;

    new-instance p1, Lmh3/b;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lmh3/b;-><init>(I)V

    iput-object p1, p0, Lch3/j;->K:Lmh3/b;

    int-to-long p1, p2

    invoke-virtual {p0, p1, p2}, Lxg3/s;->e(J)V

    return-void
.end method


# virtual methods
.method public final g()V
    .locals 6

    iget-object v0, p0, Lch3/j;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_0
    iget-object v0, p0, Lch3/j;->E:Lch3/o0;

    invoke-virtual {v0}, Lxg3/s;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-boolean v0, p0, Lch3/j;->M:Z

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lch3/j;->L:Z

    iget-object v1, p0, Lch3/j;->H:Ljava/util/AbstractQueue;

    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v0, :cond_4

    if-eqz v3, :cond_4

    iget-object v0, p0, Lch3/j;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lgh3/c;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lch3/j;->E:Lch3/o0;

    invoke-virtual {v0}, Lch3/o0;->onCompleted()V

    return-void

    :cond_3
    invoke-static {v0}, Lgh3/c;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lch3/j;->E:Lch3/o0;

    invoke-virtual {v1, v0}, Lch3/o0;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    if-nez v3, :cond_8

    :try_start_0
    iget-object v0, p0, Lch3/j;->F:Lbh3/g;

    invoke-static {v1}, Lch3/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lbh3/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxg3/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_5

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "The source returned by the mapper was null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lch3/j;->h(Ljava/lang/Throwable;)V

    return-void

    :cond_5
    invoke-static {}, Lxg3/g;->l()Lxg3/g;

    move-result-object v1

    const-wide/16 v3, 0x1

    if-eq v0, v1, :cond_7

    instance-of v1, v0, Lgh3/l;

    if-eqz v1, :cond_6

    check-cast v0, Lgh3/l;

    iput-boolean v2, p0, Lch3/j;->M:Z

    iget-object v1, p0, Lch3/j;->G:Ldh3/a;

    new-instance v2, Lch3/h;

    iget-object v0, v0, Lgh3/l;->x:Ljava/lang/Object;

    invoke-direct {v2, v0, p0}, Lch3/h;-><init>(Ljava/lang/Object;Lch3/j;)V

    invoke-virtual {v1, v2}, Ldh3/a;->c(Lxg3/i;)V

    goto :goto_2

    :cond_6
    new-instance v1, Lch3/i;

    invoke-direct {v1, p0}, Lch3/i;-><init>(Lch3/j;)V

    iget-object v5, p0, Lch3/j;->K:Lmh3/b;

    iget-object v5, v5, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    check-cast v5, Lfh3/a;

    invoke-virtual {v5, v1}, Lfh3/a;->c(Lxg3/t;)V

    invoke-virtual {v1}, Lxg3/s;->a()Z

    move-result v5

    if-nez v5, :cond_9

    iput-boolean v2, p0, Lch3/j;->M:Z

    invoke-virtual {v0, v1}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    :goto_2
    invoke-virtual {p0, v3, v4}, Lxg3/s;->e(J)V

    goto :goto_3

    :cond_7
    invoke-virtual {p0, v3, v4}, Lxg3/s;->e(J)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lch3/j;->h(Ljava/lang/Throwable;)V

    return-void

    :cond_8
    :goto_3
    iget-object v0, p0, Lch3/j;->I:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    :cond_9
    :goto_4
    return-void
.end method

.method public final h(Ljava/lang/Throwable;)V
    .locals 2

    invoke-virtual {p0}, Lxg3/s;->b()V

    iget-object v0, p0, Lch3/j;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lgh3/c;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lgh3/c;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lgh3/c;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lch3/j;->E:Lch3/o0;

    invoke-virtual {v0, p1}, Lch3/o0;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final i(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lch3/j;->G:Ldh3/a;

    invoke-virtual {v0, p1, p2}, Ldh3/a;->b(J)V

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lch3/j;->M:Z

    invoke-virtual {p0}, Lch3/j;->g()V

    return-void
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lch3/j;->E:Lch3/o0;

    invoke-virtual {v0, p1}, Lch3/o0;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public final onCompleted()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/j;->L:Z

    invoke-virtual {p0}, Lch3/j;->g()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lch3/j;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lgh3/c;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lch3/j;->L:Z

    iget-object p1, p0, Lch3/j;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lgh3/c;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lgh3/c;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lch3/j;->E:Lch3/o0;

    invoke-virtual {v0, p1}, Lch3/o0;->onError(Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lch3/j;->K:Lmh3/b;

    invoke-virtual {p1}, Lmh3/b;->b()V

    return-void

    :cond_1
    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lch3/d;->b:Lch3/b;

    :cond_0
    iget-object v0, p0, Lch3/j;->H:Ljava/util/AbstractQueue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lxg3/s;->b()V

    new-instance p1, Lrx/exceptions/MissingBackpressureException;

    invoke-direct {p1}, Lrx/exceptions/MissingBackpressureException;-><init>()V

    invoke-virtual {p0, p1}, Lch3/j;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lch3/j;->g()V

    return-void
.end method
