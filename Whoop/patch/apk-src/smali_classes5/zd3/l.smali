.class public final Lzd3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:Lud3/k;

.field public volatile x:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic y:Lzd3/o;


# direct methods
.method public constructor <init>(Lzd3/o;Lud3/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "responseCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lzd3/l;->y:Lzd3/o;

    iput-object p2, p0, Lzd3/l;->w:Lud3/k;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lzd3/l;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    const-string v0, "Callback failure for "

    const-string v1, "canceled due to "

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OkHttp "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lzd3/l;->y:Lzd3/o;

    iget-object v3, v3, Lzd3/o;->x:Lud3/o0;

    iget-object v3, v3, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v3}, Lud3/e0;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lzd3/l;->y:Lzd3/o;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :try_start_0
    iget-object v2, v3, Lzd3/o;->F:Lzd3/n;

    invoke-virtual {v2}, Lne3/d;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    :try_start_1
    invoke-virtual {v3}, Lzd3/o;->g()Lud3/x0;

    move-result-object v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v8, 0x1

    :try_start_2
    iget-object v9, p0, Lzd3/l;->w:Lud3/k;

    invoke-interface {v9, v3, v7}, Lud3/k;->onResponse(Lud3/j;Lud3/x0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v0, v3, Lzd3/o;->w:Lud3/l0;

    iget-object v0, v0, Lud3/l0;->a:Lud3/u;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v6, v6, p0, v2}, Lud3/u;->c(Lud3/u;Lzd3/l;Lzd3/o;Lzd3/l;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :catchall_1
    move-exception v0

    move v7, v8

    goto :goto_1

    :catch_0
    move-exception v1

    move v7, v8

    goto :goto_3

    :catchall_2
    move-exception v0

    :goto_1
    :try_start_4
    invoke-virtual {v3}, Lzd3/o;->cancel()V

    if-nez v7, :cond_0

    new-instance v7, Ljava/io/IOException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object v1, p0, Lzd3/l;->w:Lud3/k;

    invoke-interface {v1, v3, v7}, Lud3/k;->onFailure(Lud3/j;Ljava/io/IOException;)V

    goto :goto_2

    :catchall_3
    move-exception v0

    goto :goto_6

    :cond_0
    :goto_2
    instance-of v1, v0, Ljava/lang/InterruptedException;

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    iget-object v0, v3, Lzd3/o;->w:Lud3/l0;

    iget-object v0, v0, Lud3/l0;->a:Lud3/u;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_6
    throw v0

    :catch_1
    move-exception v1

    :goto_3
    if-eqz v7, :cond_2

    sget-object v7, Lfe3/e;->a:Lfe3/e;

    sget-object v7, Lfe3/e;->a:Lfe3/e;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lzd3/o;->a(Lzd3/o;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v8, 0x4

    invoke-virtual {v7, v0, v8, v1}, Lfe3/e;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    goto :goto_4

    :cond_2
    iget-object v0, p0, Lzd3/l;->w:Lud3/k;

    invoke-interface {v0, v3, v1}, Lud3/k;->onFailure(Lud3/j;Ljava/io/IOException;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :goto_4
    :try_start_7
    iget-object v0, v3, Lzd3/o;->w:Lud3/l0;

    iget-object v0, v0, Lud3/l0;->a:Lud3/u;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_0

    :goto_5
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :goto_6
    :try_start_8
    iget-object v1, v3, Lzd3/o;->w:Lud3/l0;

    iget-object v1, v1, Lud3/l0;->a:Lud3/u;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v6, v6, p0, v2}, Lud3/u;->c(Lud3/u;Lzd3/l;Lzd3/o;Lzd3/l;I)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_7
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v0
.end method
