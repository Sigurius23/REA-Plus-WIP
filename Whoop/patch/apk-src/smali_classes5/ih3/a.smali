.class public final Lih3/a;
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

    iput-object p1, p0, Lih3/a;->E:Lxg3/s;

    return-void
.end method


# virtual methods
.method public final onCompleted()V
    .locals 3

    iget-boolean v0, p0, Lih3/a;->F:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lih3/a;->F:Z

    :try_start_0
    iget-object v0, p0, Lih3/a;->E:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lxg3/s;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    new-instance v1, Lrx/exceptions/UnsubscribeFailedException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lrx/exceptions/UnsubscribeFailedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-static {v0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    new-instance v1, Lrx/exceptions/OnCompletedFailedException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lrx/exceptions/OnCompletedFailedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_3
    invoke-virtual {p0}, Lxg3/s;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    throw v0

    :catchall_3
    move-exception v0

    invoke-static {v0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    new-instance v1, Lrx/exceptions/UnsubscribeFailedException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lrx/exceptions/UnsubscribeFailedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 4

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    iget-boolean v0, p0, Lih3/a;->F:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lih3/a;->F:Z

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->b()Ljh3/d;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Lih3/a;->E:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Lrx/exceptions/OnErrorNotImplementedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lxg3/s;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    new-instance v0, Lrx/exceptions/OnErrorFailedException;

    invoke-direct {v0, p1}, Lrx/exceptions/OnErrorFailedException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :goto_0
    invoke-static {v0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    :try_start_2
    invoke-virtual {p0}, Lxg3/s;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    new-instance v1, Lrx/exceptions/OnErrorFailedException;

    new-instance v2, Lrx/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v2, p1}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/List;)V

    const-string p1, "Error occurred when trying to propagate error to Observer.onError"

    invoke-direct {v1, p1, v2}, Lrx/exceptions/OnErrorFailedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catchall_2
    move-exception v1

    invoke-static {v1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    new-instance v2, Lrx/exceptions/OnErrorFailedException;

    new-instance v3, Lrx/exceptions/CompositeException;

    filled-new-array {p1, v0, v1}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v3, p1}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/List;)V

    const-string p1, "Error occurred when trying to propagate error to Observer.onError and during unsubscription."

    invoke-direct {v2, p1, v3}, Lrx/exceptions/OnErrorFailedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :goto_1
    :try_start_3
    invoke-virtual {p0}, Lxg3/s;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    throw v0

    :catchall_3
    move-exception v0

    invoke-static {v0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    new-instance v1, Lrx/exceptions/OnErrorNotImplementedException;

    new-instance v2, Lrx/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v2, p1}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/List;)V

    const-string p1, "Observer.onError not implemented and error while unsubscribing."

    invoke-direct {v1, p1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    iget-boolean v0, p0, Lih3/a;->F:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lih3/a;->E:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    invoke-static {p1, p0}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    return-void
.end method
