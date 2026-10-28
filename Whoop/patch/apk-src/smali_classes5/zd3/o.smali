.class public final Lzd3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/j;
.implements Ljava/lang/Cloneable;


# instance fields
.field public final E:Lud3/a0;

.field public final F:Lzd3/n;

.field public final G:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public H:Ljava/lang/Object;

.field public I:Lzd3/h;

.field public J:Lzd3/p;

.field public K:Z

.field public L:Lzd3/g;

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public volatile R:Z

.field public volatile S:Lzd3/g;

.field public final T:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final w:Lud3/l0;

.field public final x:Lud3/o0;

.field public final y:Z

.field public final z:Lzd3/q;


# direct methods
.method public constructor <init>(Lud3/l0;Lud3/o0;Z)V
    .locals 2

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd3/o;->w:Lud3/l0;

    iput-object p2, p0, Lzd3/o;->x:Lud3/o0;

    iput-boolean p3, p0, Lzd3/o;->y:Z

    iget-object p3, p1, Lud3/l0;->F:Lud3/q;

    iget-object p3, p3, Lud3/q;->a:Lzd3/q;

    iput-object p3, p0, Lzd3/o;->z:Lzd3/q;

    iget-object p3, p1, Lud3/l0;->d:Lud3/z;

    invoke-interface {p3, p0}, Lud3/z;->b(Lzd3/o;)Lud3/a0;

    move-result-object p3

    iput-object p3, p0, Lzd3/o;->E:Lud3/a0;

    new-instance p3, Lzd3/n;

    invoke-direct {p3, p0}, Lzd3/n;-><init>(Lzd3/o;)V

    iget p1, p1, Lud3/l0;->w:I

    int-to-long v0, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, v0, v1, p1}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    iput-object p3, p0, Lzd3/o;->F:Lzd3/n;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lzd3/o;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzd3/o;->Q:Z

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lzd3/o;->T:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object p2, p2, Lud3/o0;->e:Lv63/c;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public static final a(Lzd3/o;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v1, p0, Lzd3/o;->R:Z

    if-eqz v1, :cond_0

    const-string v1, "canceled "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lzd3/o;->y:Z

    if-eqz v1, :cond_1

    const-string v1, "web socket"

    goto :goto_1

    :cond_1
    const-string v1, "call"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lzd3/o;->x:Lud3/o0;

    iget-object p0, p0, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {p0}, Lud3/e0;->j()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lzd3/p;)V
    .locals 2

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-object v0, p0, Lzd3/o;->J:Lzd3/p;

    if-nez v0, :cond_0

    iput-object p1, p0, Lzd3/o;->J:Lzd3/p;

    iget-object p1, p1, Lzd3/p;->q:Ljava/util/ArrayList;

    new-instance v0, Lzd3/m;

    iget-object v1, p0, Lzd3/o;->H:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Lzd3/m;-><init>(Lzd3/o;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 3

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-object v0, p0, Lzd3/o;->J:Lzd3/p;

    if-eqz v0, :cond_3

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lzd3/o;->j()Ljava/net/Socket;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v2, p0, Lzd3/o;->J:Lzd3/p;

    if-nez v2, :cond_1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lwd3/h;->c(Ljava/net/Socket;)V

    :cond_0
    iget-object v1, p0, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v1, p0, v0}, Lud3/a0;->connectionReleased(Lud3/j;Lud3/p;)V

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_3
    :goto_0
    iget-boolean v0, p0, Lzd3/o;->K:Z

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lzd3/o;->F:Lzd3/n;

    invoke-virtual {v0}, Lne3/d;->j()Z

    move-result v0

    if-nez v0, :cond_5

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_5
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_6

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_6
    :goto_2
    if-eqz p1, :cond_7

    iget-object p1, p0, Lzd3/o;->E:Lud3/a0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, Lud3/a0;->callFailed(Lud3/j;Ljava/io/IOException;)V

    return-object v0

    :cond_7
    iget-object p1, p0, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {p1, p0}, Lud3/a0;->callEnd(Lud3/j;)V

    return-object v0
.end method

.method public final cancel()V
    .locals 2

    iget-boolean v0, p0, Lzd3/o;->R:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzd3/o;->R:Z

    iget-object v0, p0, Lzd3/o;->S:Lzd3/g;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lzd3/g;->d:Lae3/g;

    invoke-interface {v0}, Lae3/g;->cancel()V

    :cond_1
    iget-object v0, p0, Lzd3/o;->T:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd3/v;

    invoke-interface {v1}, Lzd3/v;->cancel()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v0, p0}, Lud3/a0;->canceled(Lud3/j;)V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lzd3/o;

    iget-object v1, p0, Lzd3/o;->x:Lud3/o0;

    iget-boolean v2, p0, Lzd3/o;->y:Z

    iget-object v3, p0, Lzd3/o;->w:Lud3/l0;

    invoke-direct {v0, v3, v1, v2}, Lzd3/o;-><init>(Lud3/l0;Lud3/o0;Z)V

    return-object v0
.end method

.method public final d(Lud3/k;)V
    .locals 3

    const-string v0, "responseCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzd3/o;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    invoke-virtual {v0}, Lfe3/e;->h()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lzd3/o;->H:Ljava/lang/Object;

    iget-object v0, p0, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v0, p0}, Lud3/a0;->callStart(Lud3/j;)V

    iget-object v0, p0, Lzd3/o;->w:Lud3/l0;

    iget-object v0, v0, Lud3/l0;->a:Lud3/u;

    new-instance v1, Lzd3/l;

    invoke-direct {v1, p0, p1}, Lzd3/l;-><init>(Lzd3/o;Lud3/k;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x6

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, v2, p1}, Lud3/u;->c(Lud3/u;Lzd3/l;Lzd3/o;Lzd3/l;I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already Executed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()Lud3/x0;
    .locals 4

    iget-object v0, p0, Lzd3/o;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzd3/o;->F:Lzd3/n;

    invoke-virtual {v0}, Lne3/d;->i()V

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    invoke-virtual {v0}, Lfe3/e;->h()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lzd3/o;->H:Ljava/lang/Object;

    iget-object v0, p0, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {v0, p0}, Lud3/a0;->callStart(Lud3/j;)V

    const/4 v0, 0x5

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lzd3/o;->w:Lud3/l0;

    iget-object v2, v2, Lud3/l0;->a:Lud3/u;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v3, v2, Lud3/u;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v3, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v2

    invoke-virtual {p0}, Lzd3/o;->g()Lud3/x0;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v3, p0, Lzd3/o;->w:Lud3/l0;

    iget-object v3, v3, Lud3/l0;->a:Lud3/u;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v1, p0, v1, v0}, Lud3/u;->c(Lud3/u;Lzd3/l;Lzd3/o;Lzd3/l;I)V

    return-object v2

    :catchall_0
    move-exception v2

    goto :goto_0

    :catchall_1
    move-exception v3

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    iget-object v3, p0, Lzd3/o;->w:Lud3/l0;

    iget-object v3, v3, Lud3/l0;->a:Lud3/u;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v1, p0, v1, v0}, Lud3/u;->c(Lud3/u;Lzd3/l;Lzd3/o;Lzd3/l;I)V

    throw v2

    :cond_0
    const-string v0, "Already Executed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final f(Z)V
    .locals 8

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lzd3/o;->Q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    if-eqz p1, :cond_0

    iget-object v2, p0, Lzd3/o;->S:Lzd3/g;

    if-eqz v2, :cond_0

    iget-object p1, v2, Lzd3/g;->d:Lae3/g;

    invoke-interface {p1}, Lae3/g;->cancel()V

    iget-object v1, v2, Lzd3/g;->a:Lzd3/o;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v7}, Lzd3/o;->h(Lzd3/g;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lzd3/o;->L:Lzd3/g;

    return-void

    :cond_1
    :try_start_1
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit p0

    throw p1
.end method

.method public final g()Lud3/x0;
    .locals 9

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lzd3/o;->w:Lud3/l0;

    iget-object v0, v0, Lud3/l0;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    new-instance v0, Lae3/a;

    iget-object v1, p0, Lzd3/o;->w:Lud3/l0;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lae3/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lae3/a;

    iget-object v1, p0, Lzd3/o;->w:Lud3/l0;

    iget-object v1, v1, Lud3/l0;->j:Lud3/t;

    invoke-direct {v0, v1}, Lae3/a;-><init>(Lud3/t;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lae3/a;

    iget-object v1, p0, Lzd3/o;->w:Lud3/l0;

    iget-object v1, v1, Lud3/l0;->k:Lud3/g;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3}, Lae3/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lzd3/a;->w:Lzd3/a;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lzd3/o;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lzd3/o;->w:Lud3/l0;

    iget-object v0, v0, Lud3/l0;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    :cond_0
    sget-object v0, Lae3/c;->w:Lae3/c;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lae3/i;

    iget-object v5, p0, Lzd3/o;->x:Lud3/o0;

    iget-object v1, p0, Lzd3/o;->w:Lud3/l0;

    iget v6, v1, Lud3/l0;->x:I

    iget v7, v1, Lud3/l0;->y:I

    iget v8, v1, Lud3/l0;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lae3/i;-><init>(Lzd3/o;Ljava/util/ArrayList;ILzd3/g;Lud3/o0;III)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, v1, Lzd3/o;->x:Lud3/o0;

    invoke-virtual {v0, v4}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v0

    iget-boolean v4, v1, Lzd3/o;->R:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_1

    invoke-virtual {p0, v2}, Lzd3/o;->i(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v0

    :cond_1
    :try_start_1
    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    new-instance v0, Ljava/io/IOException;

    const-string v4, "Canceled"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v3, 0x1

    :try_start_2
    invoke-virtual {p0, v0}, Lzd3/o;->i(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    const-string v4, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    if-nez v3, :cond_2

    invoke-virtual {p0, v2}, Lzd3/o;->i(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_2
    throw v0
.end method

.method public final h(Lzd3/g;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    const-string v0, "exchange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzd3/o;->S:Lzd3/g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_5

    :cond_0
    monitor-enter p0

    const/4 p1, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    iget-boolean v1, p0, Lzd3/o;->M:Z

    if-nez v1, :cond_4

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    iget-boolean v1, p0, Lzd3/o;->N:Z

    if-nez v1, :cond_4

    :cond_2
    if-eqz p5, :cond_3

    iget-boolean v1, p0, Lzd3/o;->O:Z

    if-nez v1, :cond_4

    :cond_3
    if-eqz p4, :cond_b

    iget-boolean v1, p0, Lzd3/o;->P:Z

    if-eqz v1, :cond_b

    :cond_4
    if-eqz p2, :cond_5

    iput-boolean v0, p0, Lzd3/o;->M:Z

    :cond_5
    if-eqz p3, :cond_6

    iput-boolean v0, p0, Lzd3/o;->N:Z

    :cond_6
    if-eqz p5, :cond_7

    iput-boolean v0, p0, Lzd3/o;->O:Z

    :cond_7
    if-eqz p4, :cond_8

    iput-boolean v0, p0, Lzd3/o;->P:Z

    :cond_8
    iget-boolean p2, p0, Lzd3/o;->M:Z

    if-nez p2, :cond_9

    iget-boolean p2, p0, Lzd3/o;->N:Z

    if-nez p2, :cond_9

    iget-boolean p2, p0, Lzd3/o;->O:Z

    if-nez p2, :cond_9

    iget-boolean p2, p0, Lzd3/o;->P:Z

    if-nez p2, :cond_9

    move p2, p1

    goto :goto_1

    :cond_9
    move p2, v0

    :goto_1
    if-eqz p2, :cond_a

    iget-boolean p3, p0, Lzd3/o;->Q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p3, :cond_a

    move v0, p1

    :cond_a
    move v2, v0

    move v0, p2

    move p2, v2

    goto :goto_3

    :goto_2
    monitor-exit p0

    throw p1

    :cond_b
    move p2, v0

    :goto_3
    monitor-exit p0

    if-eqz v0, :cond_c

    const/4 p3, 0x0

    iput-object p3, p0, Lzd3/o;->S:Lzd3/g;

    iget-object p3, p0, Lzd3/o;->J:Lzd3/p;

    if-eqz p3, :cond_c

    monitor-enter p3

    :try_start_1
    iget p4, p3, Lzd3/p;->n:I

    add-int/2addr p4, p1

    iput p4, p3, Lzd3/p;->n:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p3

    goto :goto_4

    :catchall_1
    move-exception p1

    monitor-exit p3

    throw p1

    :cond_c
    :goto_4
    if-eqz p2, :cond_d

    invoke-virtual {p0, p6}, Lzd3/o;->c(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :cond_d
    :goto_5
    return-object p6
.end method

.method public final i(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lzd3/o;->Q:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lzd3/o;->Q:Z

    iget-boolean v0, p0, Lzd3/o;->M:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lzd3/o;->N:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lzd3/o;->O:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lzd3/o;->P:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lzd3/o;->c(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :cond_1
    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final j()Ljava/net/Socket;
    .locals 6

    iget-object v0, p0, Lzd3/o;->J:Lzd3/p;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-object v1, v0, Lzd3/p;->q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/Reference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_1
    if-eq v3, v5, :cond_5

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, Lzd3/o;->J:Lzd3/p;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    iput-wide v3, v0, Lzd3/p;->r:J

    iget-object v1, p0, Lzd3/o;->z:Lzd3/q;

    iget-object v3, v1, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iget-object v4, v1, Lzd3/q;->b:Lyd3/c;

    sget-object v5, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-boolean v5, v0, Lzd3/p;->k:Z

    if-nez v5, :cond_2

    iget-object v0, v1, Lzd3/q;->c:Lyd3/b;

    invoke-static {v4, v0}, Lyd3/c;->e(Lyd3/c;Lyd3/a;)V

    return-object v2

    :cond_2
    const/4 v1, 0x1

    iput-boolean v1, v0, Lzd3/p;->k:Z

    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v4}, Lyd3/c;->a()V

    :cond_3
    iget-object v0, v0, Lzd3/p;->e:Ljava/net/Socket;

    return-object v0

    :cond_4
    return-object v2

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
