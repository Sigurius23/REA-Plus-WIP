.class public final Lds/o;
.super Lds/n;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lds/g;


# instance fields
.field public H:Lds/w;

.field public I:Lrm/p;


# virtual methods
.method public final c()V
    .locals 5

    iget-object v0, p0, Lds/o;->H:Lds/w;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    iget-object v4, p0, Lds/n;->w:Ljava/lang/Object;

    instance-of v4, v4, Lds/a;

    and-int/2addr v3, v4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lds/n;->w:Ljava/lang/Object;

    instance-of v4, v3, Lds/a;

    if-eqz v4, :cond_1

    check-cast v3, Lds/a;

    iget-boolean v3, v3, Lds/a;->a:Z

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    invoke-virtual {v0, v1}, Lds/n;->cancel(Z)Z

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lds/o;->H:Lds/w;

    iput-object v0, p0, Lds/o;->I:Lrm/p;

    return-void
.end method

.method public final i()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lds/o;->H:Lds/w;

    iget-object v1, p0, Lds/o;->I:Lrm/p;

    invoke-super {p0}, Lds/n;->i()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "inputFuture=["

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "], "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "function=["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    if-eqz v2, :cond_2

    invoke-static {v0, v2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lds/n;->w:Ljava/lang/Object;

    instance-of v0, v0, Lds/a;

    return v0
.end method

.method public final run()V
    .locals 6

    iget-object v0, p0, Lds/o;->H:Lds/w;

    iget-object v1, p0, Lds/o;->I:Lrm/p;

    iget-object v2, p0, Lds/n;->w:Ljava/lang/Object;

    instance-of v2, v2, Lds/a;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_0

    move v5, v3

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    or-int/2addr v2, v5

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v2, v3

    if-eqz v2, :cond_2

    goto/16 :goto_3

    :cond_2
    const/4 v2, 0x0

    iput-object v2, p0, Lds/o;->H:Lds/w;

    iget-object v3, v0, Lds/n;->w:Ljava/lang/Object;

    instance-of v3, v3, Lds/a;

    if-eqz v3, :cond_6

    iget-object v1, p0, Lds/n;->w:Ljava/lang/Object;

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lds/n;->isDone()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Lds/n;->h(Lds/v;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lds/n;->F:Lbi/g;

    invoke-virtual {v1, p0, v2, v0}, Lbi/g;->k(Lds/n;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p0, v4}, Lds/n;->e(Lds/n;Z)V

    return-void

    :cond_3
    new-instance v1, Lds/e;

    invoke-direct {v1, p0, v0}, Lds/e;-><init>(Lds/o;Lds/w;)V

    sget-object v3, Lds/n;->F:Lbi/g;

    invoke-virtual {v3, p0, v2, v1}, Lbi/g;->k(Lds/n;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :try_start_0
    sget-object v2, Lds/r;->w:Lds/r;

    invoke-virtual {v0, v1, v2}, Lds/n;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    new-instance v2, Lds/b;

    invoke-direct {v2, v0}, Lds/b;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    sget-object v2, Lds/b;->b:Lds/b;

    :goto_2
    sget-object v0, Lds/n;->F:Lbi/g;

    invoke-virtual {v0, p0, v1, v2}, Lbi/g;->k(Lds/n;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_4
    iget-object v1, p0, Lds/n;->w:Ljava/lang/Object;

    :cond_5
    instance-of v2, v1, Lds/a;

    if-eqz v2, :cond_8

    check-cast v1, Lds/a;

    iget-boolean v1, v1, Lds/a;->a:Z

    invoke-virtual {v0, v1}, Lds/n;->cancel(Z)Z

    return-void

    :cond_6
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v3

    const-string v5, "Future was expected to be done: %s"

    if-eqz v3, :cond_a

    invoke-static {v0}, Lbp/b;->x(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-interface {v1, v0}, Lyr/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    iput-object v2, p0, Lds/o;->I:Lrm/p;

    if-nez v0, :cond_7

    sget-object v0, Lds/n;->G:Ljava/lang/Object;

    :cond_7
    sget-object v1, Lds/n;->F:Lbi/g;

    invoke-virtual {v1, p0, v2, v0}, Lbi/g;->k(Lds/n;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p0, v4}, Lds/n;->e(Lds/n;Z)V

    :cond_8
    :goto_3
    return-void

    :catchall_1
    move-exception v0

    :try_start_4
    instance-of v1, v0, Ljava/lang/InterruptedException;

    if-eqz v1, :cond_9

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_9
    invoke-virtual {p0, v0}, Lds/n;->k(Ljava/lang/Throwable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    iput-object v2, p0, Lds/o;->I:Lrm/p;

    return-void

    :catchall_2
    move-exception v0

    iput-object v2, p0, Lds/o;->I:Lrm/p;

    throw v0

    :cond_a
    :try_start_5
    new-instance v1, Ljava/lang/IllegalStateException;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5, v0}, Lrs/b;->k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    move-exception v0

    invoke-virtual {p0, v0}, Lds/n;->k(Ljava/lang/Throwable;)Z

    return-void

    :catch_2
    move-exception v0

    invoke-virtual {p0, v0}, Lds/n;->k(Ljava/lang/Throwable;)Z

    return-void

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lds/n;->k(Ljava/lang/Throwable;)Z

    return-void

    :catch_4
    invoke-virtual {p0, v4}, Lds/n;->cancel(Z)Z

    return-void
.end method
