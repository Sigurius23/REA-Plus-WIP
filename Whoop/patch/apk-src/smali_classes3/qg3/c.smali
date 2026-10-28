.class public final Lqg3/c;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lxg3/t;
.implements Lxg3/i;


# instance fields
.field public final w:Lpg3/e;

.field public final x:Lxg3/s;

.field public volatile y:Z

.field public volatile z:Lpg3/v0;


# direct methods
.method public constructor <init>(Lpg3/e;Lxg3/s;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lqg3/c;->w:Lpg3/e;

    iput-object p2, p0, Lqg3/c;->x:Lxg3/s;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lqg3/c;->y:Z

    return v0
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg3/c;->y:Z

    iget-object v0, p0, Lqg3/c;->w:Lpg3/e;

    invoke-interface {v0}, Lpg3/e;->cancel()V

    return-void
.end method

.method public final c(Lpg3/v0;)V
    .locals 2

    :try_start_0
    iget-boolean v0, p0, Lqg3/c;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg3/c;->x:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catch Lrx/exceptions/OnCompletedFailedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lrx/exceptions/OnErrorFailedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lrx/exceptions/OnErrorNotImplementedException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    :try_start_1
    iget-boolean p1, p0, Lqg3/c;->y:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lqg3/c;->x:Lxg3/s;

    invoke-interface {p1}, Lxg3/h;->onCompleted()V
    :try_end_1
    .catch Lrx/exceptions/OnCompletedFailedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lrx/exceptions/OnErrorFailedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lrx/exceptions/OnErrorNotImplementedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :catch_0
    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :goto_1
    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    :try_start_2
    iget-object v0, p0, Lqg3/c;->x:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Lrx/exceptions/OnCompletedFailedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lrx/exceptions/OnErrorFailedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lrx/exceptions/OnErrorNotImplementedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    new-instance v1, Lrx/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lrx/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :catch_1
    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :goto_2
    return-void

    :catch_2
    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final request(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_3

    if-eq p1, p2, :cond_4

    const/4 p2, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    if-ne p1, p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown state: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-virtual {p0, v0, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lqg3/c;->z:Lpg3/v0;

    invoke-virtual {p0, p1}, Lqg3/c;->c(Lpg3/v0;)V

    return-void

    :cond_3
    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result p1

    if-eqz p1, :cond_0

    :cond_4
    :goto_0
    return-void
.end method
