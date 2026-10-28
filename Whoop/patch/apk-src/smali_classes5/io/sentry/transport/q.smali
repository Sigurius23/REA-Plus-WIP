.class public final Lio/sentry/transport/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public E:Ljava/util/Timer;

.field public final F:Lio/sentry/util/a;

.field public final w:Lio/sentry/transport/d;

.field public final x:Lio/sentry/q6;

.field public final y:Ljava/util/concurrent/ConcurrentHashMap;

.field public final z:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(Lio/sentry/q6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/transport/q;->y:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/transport/q;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/transport/q;->E:Ljava/util/Timer;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/transport/q;->F:Lio/sentry/util/a;

    sget-object v0, Lio/sentry/transport/d;->w:Lio/sentry/transport/d;

    iput-object v0, p0, Lio/sentry/transport/q;->w:Lio/sentry/transport/d;

    iput-object p1, p0, Lio/sentry/transport/q;->x:Lio/sentry/q6;

    return-void
.end method


# virtual methods
.method public final b(Lio/sentry/m;Ljava/util/Date;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/transport/q;->y:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Date;

    if-eqz v1, :cond_1

    invoke-virtual {p2, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/sentry/transport/q;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/transport/p;

    invoke-interface {v0, p0}, Lio/sentry/transport/p;->k(Lio/sentry/transport/q;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lio/sentry/transport/q;->F:Lio/sentry/util/a;

    invoke-virtual {p1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lio/sentry/transport/q;->E:Ljava/util/Timer;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/Timer;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/transport/q;->E:Ljava/util/Timer;

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v0, p0, Lio/sentry/transport/q;->E:Ljava/util/Timer;

    new-instance v1, Lio/sentry/transport/o;

    invoke-direct {v1, p0}, Lio/sentry/transport/o;-><init>(Lio/sentry/transport/q;)V

    invoke-virtual {v0, v1, p2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;Ljava/util/Date;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lio/sentry/s;->close()V

    return-void

    :goto_3
    :try_start_1
    invoke-virtual {p1}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p2
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lio/sentry/transport/q;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/transport/q;->E:Ljava/util/Timer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/transport/q;->E:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    iget-object v0, p0, Lio/sentry/transport/q;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public final h(Lio/sentry/m;)Z
    .locals 4

    new-instance v0, Ljava/util/Date;

    iget-object v1, p0, Lio/sentry/transport/q;->w:Lio/sentry/transport/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    sget-object v1, Lio/sentry/m;->All:Lio/sentry/m;

    iget-object v2, p0, Lio/sentry/transport/q;->y:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Date;

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v1

    if-nez v1, :cond_0

    return v3

    :cond_0
    sget-object v1, Lio/sentry/m;->Unknown:Lio/sentry/m;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p1

    xor-int/2addr p1, v3

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
