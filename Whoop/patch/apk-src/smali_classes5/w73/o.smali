.class public final Lw73/o;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Ll73/d;
.implements Ljava/lang/Runnable;
.implements Ls73/a;


# instance fields
.field public E:Ln73/b;

.field public F:Ljava/lang/Throwable;

.field public volatile G:Z

.field public volatile H:Z

.field public I:I

.field public J:Z

.field public final w:Ll73/d;

.field public final x:Ll73/f;

.field public final y:I

.field public z:Ls73/e;


# direct methods
.method public constructor <init>(Ll73/d;Ll73/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lw73/o;->w:Ll73/d;

    iput-object p2, p0, Lw73/o;->x:Ll73/f;

    iput p3, p0, Lw73/o;->y:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/o;->J:Z

    const/4 v0, 0x2

    return v0
.end method

.method public final b(Ln73/b;)V
    .locals 2

    iget-object v0, p0, Lw73/o;->E:Ln73/b;

    invoke-static {v0, p1}, Lq73/c;->c(Ln73/b;Ln73/b;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lw73/o;->E:Ln73/b;

    instance-of v0, p1, Ls73/a;

    if-eqz v0, :cond_1

    check-cast p1, Ls73/a;

    invoke-interface {p1}, Ls73/b;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Lw73/o;->I:I

    iput-object p1, p0, Lw73/o;->z:Ls73/e;

    iput-boolean v1, p0, Lw73/o;->G:Z

    iget-object p1, p0, Lw73/o;->w:Ll73/d;

    invoke-interface {p1, p0}, Ll73/d;->b(Ln73/b;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lw73/o;->x:Ll73/f;

    invoke-virtual {p1, p0}, Ll73/f;->b(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Lw73/o;->I:I

    iput-object p1, p0, Lw73/o;->z:Ls73/e;

    iget-object p1, p0, Lw73/o;->w:Ll73/d;

    invoke-interface {p1, p0}, Ll73/d;->b(Ln73/b;)V

    return-void

    :cond_1
    new-instance p1, Lx73/b;

    iget v0, p0, Lw73/o;->y:I

    invoke-direct {p1, v0}, Lx73/b;-><init>(I)V

    iput-object p1, p0, Lw73/o;->z:Ls73/e;

    iget-object p1, p0, Lw73/o;->w:Ll73/d;

    invoke-interface {p1, p0}, Ll73/d;->b(Ln73/b;)V

    :cond_2
    return-void
.end method

.method public final c(ZZLl73/d;)Z
    .locals 2

    iget-boolean v0, p0, Lw73/o;->H:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lw73/o;->z:Ls73/e;

    invoke-interface {p1}, Ls73/e;->clear()V

    return v1

    :cond_0
    if-eqz p1, :cond_2

    iget-object p1, p0, Lw73/o;->F:Ljava/lang/Throwable;

    if-eqz p1, :cond_1

    iput-boolean v1, p0, Lw73/o;->H:Z

    iget-object p2, p0, Lw73/o;->z:Ls73/e;

    invoke-interface {p2}, Ls73/e;->clear()V

    invoke-interface {p3, p1}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lw73/o;->x:Ll73/f;

    invoke-interface {p1}, Ln73/b;->dispose()V

    return v1

    :cond_1
    if-eqz p2, :cond_2

    iput-boolean v1, p0, Lw73/o;->H:Z

    invoke-interface {p3}, Ll73/d;->onComplete()V

    iget-object p1, p0, Lw73/o;->x:Ll73/f;

    invoke-interface {p1}, Ln73/b;->dispose()V

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lw73/o;->z:Ls73/e;

    invoke-interface {v0}, Ls73/e;->clear()V

    return-void
.end method

.method public final dispose()V
    .locals 1

    iget-boolean v0, p0, Lw73/o;->H:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/o;->H:Z

    iget-object v0, p0, Lw73/o;->E:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    iget-object v0, p0, Lw73/o;->x:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    iget-boolean v0, p0, Lw73/o;->J:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw73/o;->z:Ls73/e;

    invoke-interface {v0}, Ls73/e;->clear()V

    :cond_0
    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lw73/o;->H:Z

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lw73/o;->z:Ls73/e;

    invoke-interface {v0}, Ls73/e;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should not be called"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onComplete()V
    .locals 1

    iget-boolean v0, p0, Lw73/o;->G:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lw73/o;->G:Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lw73/o;->x:Ll73/f;

    invoke-virtual {v0, p0}, Ll73/f;->b(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lw73/o;->G:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Lw73/o;->F:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lw73/o;->G:Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lw73/o;->x:Ll73/f;

    invoke-virtual {p1, p0}, Ll73/f;->b(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lw73/o;->G:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lw73/o;->I:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lw73/o;->z:Ls73/e;

    invoke-interface {v0, p1}, Ls73/e;->offer(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lw73/o;->x:Ll73/f;

    invoke-virtual {p1, p0}, Ll73/f;->b(Ljava/lang/Runnable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final poll()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw73/o;->z:Ls73/e;

    invoke-interface {v0}, Ls73/e;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final run()V
    .locals 7

    iget-boolean v0, p0, Lw73/o;->J:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    move v0, v1

    :cond_0
    iget-boolean v2, p0, Lw73/o;->H:Z

    if-eqz v2, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-boolean v2, p0, Lw73/o;->G:Z

    iget-object v3, p0, Lw73/o;->F:Ljava/lang/Throwable;

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    iput-boolean v1, p0, Lw73/o;->H:Z

    iget-object v0, p0, Lw73/o;->w:Ll73/d;

    iget-object v1, p0, Lw73/o;->F:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lw73/o;->x:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void

    :cond_2
    iget-object v3, p0, Lw73/o;->w:Ll73/d;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ll73/d;->onNext(Ljava/lang/Object;)V

    if-eqz v2, :cond_4

    iput-boolean v1, p0, Lw73/o;->H:Z

    iget-object v0, p0, Lw73/o;->F:Ljava/lang/Throwable;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lw73/o;->w:Ll73/d;

    invoke-interface {v1, v0}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lw73/o;->w:Ll73/d;

    invoke-interface {v0}, Ll73/d;->onComplete()V

    :goto_0
    iget-object v0, p0, Lw73/o;->x:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void

    :cond_4
    neg-int v0, v0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lw73/o;->z:Ls73/e;

    iget-object v2, p0, Lw73/o;->w:Ll73/d;

    move v3, v1

    :cond_6
    iget-boolean v4, p0, Lw73/o;->G:Z

    invoke-interface {v0}, Ls73/e;->isEmpty()Z

    move-result v5

    invoke-virtual {p0, v4, v5, v2}, Lw73/o;->c(ZZLl73/d;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    iget-boolean v4, p0, Lw73/o;->G:Z

    :try_start_0
    invoke-interface {v0}, Ls73/e;->poll()Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_8

    move v6, v1

    goto :goto_2

    :cond_8
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {p0, v4, v6, v2}, Lw73/o;->c(ZZLl73/d;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_3

    :cond_9
    if-eqz v6, :cond_a

    neg-int v3, v3

    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v3

    if-nez v3, :cond_6

    :goto_3
    return-void

    :cond_a
    invoke-interface {v2, v5}, Ll73/d;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v3

    invoke-static {v3}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    iput-boolean v1, p0, Lw73/o;->H:Z

    iget-object v1, p0, Lw73/o;->E:Ln73/b;

    invoke-interface {v1}, Ln73/b;->dispose()V

    invoke-interface {v0}, Ls73/e;->clear()V

    invoke-interface {v2, v3}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lw73/o;->x:Ll73/f;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void
.end method
