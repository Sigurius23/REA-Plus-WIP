.class public final Lqg3/a;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final E:Lxg3/s;

.field public F:Z


# direct methods
.method public constructor <init>(Lxg3/s;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lxg3/s;-><init>(Lxg3/s;Z)V

    iput-object p1, p0, Lqg3/a;->E:Lxg3/s;

    return-void
.end method


# virtual methods
.method public final onCompleted()V
    .locals 1

    iget-boolean v0, p0, Lqg3/a;->F:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg3/a;->E:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-boolean v0, p0, Lqg3/a;->F:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg3/a;->E:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "This should never happen! Report as a Retrofit bug with the full stacktrace."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lpg3/v0;

    iget-object v0, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v0, v0, Lud3/x0;->Q:Z

    iget-object v1, p0, Lqg3/a;->E:Lxg3/s;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    invoke-interface {v1, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg3/a;->F:Z

    new-instance v2, Lretrofit2/adapter/rxjava/HttpException;

    invoke-direct {v2, p1}, Lretrofit2/HttpException;-><init>(Lpg3/v0;)V

    :try_start_0
    invoke-interface {v1, v2}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Lrx/exceptions/OnCompletedFailedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lrx/exceptions/OnErrorFailedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lrx/exceptions/OnErrorNotImplementedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    new-instance v1, Lrx/exceptions/CompositeException;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Throwable;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    aput-object p1, v3, v0

    invoke-direct {v1, v3}, Lrx/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :catch_0
    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method
