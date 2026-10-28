.class public final Lud3/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lzd3/q;


# direct methods
.method public constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x5

    .line 6
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-direct {p0, v0, v1, v2}, Lud3/q;-><init>(JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(JLjava/util/concurrent/TimeUnit;)V
    .locals 2

    const-string v0, "timeUnit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lyd3/d;->l:Lyd3/d;

    .line 2
    const-string v1, "taskRunner"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v1, Lzd3/q;

    invoke-direct {v1, v0, p1, p2, p3}, Lzd3/q;-><init>(Lyd3/d;JLjava/util/concurrent/TimeUnit;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object v1, p0, Lud3/q;->a:Lzd3/q;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lud3/q;->a:Lzd3/q;

    iget-object v1, v0, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "iterator(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzd3/p;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    monitor-enter v2

    :try_start_0
    iget-object v3, v2, Lzd3/p;->q:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lzd3/p;->k:Z

    iget-object v3, v2, Lzd3/p;->e:Ljava/net/Socket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    :goto_1
    monitor-exit v2

    if-eqz v3, :cond_0

    invoke-static {v3}, Lwd3/h;->c(Ljava/net/Socket;)V

    goto :goto_0

    :goto_2
    monitor-exit v2

    throw v0

    :cond_2
    iget-object v1, v0, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lzd3/q;->b:Lyd3/c;

    invoke-virtual {v0}, Lyd3/c;->a()V

    :cond_3
    return-void
.end method

.method public final b()I
    .locals 4

    iget-object v0, p0, Lud3/q;->a:Lzd3/q;

    iget-object v0, v0, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzd3/p;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    monitor-enter v2

    :try_start_0
    iget-object v3, v2, Lzd3/p;->q:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    if-eqz v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    if-ltz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->c0()V

    const/4 v0, 0x0

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_3
    return v1
.end method
