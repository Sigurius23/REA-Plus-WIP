.class public final Lbl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbl/a;


# instance fields
.field public E:Ljava/lang/Object;

.field public final w:J

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lad3/z;Lcom/google/crypto/tink/internal/l0;)V
    .locals 3

    .line 1
    const-string v0, "runnableScheduler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5a

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lbl/c;->x:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Lbl/c;->y:Ljava/lang/Object;

    .line 6
    iput-wide v0, p0, Lbl/c;->w:J

    .line 7
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbl/c;->z:Ljava/lang/Object;

    .line 8
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lbl/c;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Lwe/o;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwe/o;-><init>(IZ)V

    iput-object v0, p0, Lbl/c;->z:Ljava/lang/Object;

    .line 11
    iput-object p1, p0, Lbl/c;->y:Ljava/lang/Object;

    const-wide/32 v0, 0xfa00000

    .line 12
    iput-wide v0, p0, Lbl/c;->w:J

    .line 13
    new-instance p1, Lcom/google/crypto/tink/internal/l0;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/internal/l0;-><init>(I)V

    iput-object p1, p0, Lbl/c;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljc/l;)V
    .locals 2

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbl/c;->z:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lbl/c;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lbl/c;->x:Ljava/lang/Object;

    check-cast v0, Lad3/z;

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public declared-synchronized b()Ltk/d;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lbl/c;->E:Ljava/lang/Object;

    check-cast v0, Ltk/d;

    if-nez v0, :cond_0

    iget-object v0, p0, Lbl/c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    iget-wide v1, p0, Lbl/c;->w:J

    invoke-static {v0, v1, v2}, Ltk/d;->J(Ljava/io/File;J)Ltk/d;

    move-result-object v0

    iput-object v0, p0, Lbl/c;->E:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lbl/c;->E:Ljava/lang/Object;

    check-cast v0, Ltk/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public c(Ljc/l;)V
    .locals 3

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/m;

    const/16 v1, 0x18

    invoke-direct {v0, v1, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lbl/c;->z:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lbl/c;->E:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashMap;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object p1, p0, Lbl/c;->x:Ljava/lang/Object;

    check-cast p1, Lad3/z;

    iget-wide v1, p0, Lbl/c;->w:J

    iget-object p1, p1, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public declared-synchronized clear()V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lbl/c;->b()Ltk/d;

    move-result-object v1

    invoke-virtual {v1}, Ltk/d;->close()V

    iget-object v1, v1, Ltk/d;->w:Ljava/io/File;

    invoke-static {v1}, Ltk/e;->a(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    iput-object v0, p0, Lbl/c;->E:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_1
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_6
    const-string v2, "DiskLruCacheWrapper"

    const/4 v3, 0x5

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "DiskLruCacheWrapper"

    const-string v3, "Unable to clear disk cache or disk cache cleared externally"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_0
    :try_start_7
    monitor-enter p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    iput-object v0, p0, Lbl/c;->E:Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_0

    :goto_1
    monitor-exit p0

    return-void

    :catchall_2
    move-exception v0

    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    throw v0

    :goto_2
    monitor-enter p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :try_start_b
    iput-object v0, p0, Lbl/c;->E:Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :try_start_c
    monitor-exit p0

    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :catchall_3
    move-exception v0

    goto :goto_3

    :catchall_4
    move-exception v0

    :try_start_d
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :try_start_e
    throw v0

    :goto_3
    monitor-exit p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    throw v0
.end method

.method public j(Lwk/e;Lz63/d;)V
    .locals 6

    const-string v0, "Had two simultaneous puts for: "

    const-string v1, "Put: Obtained: "

    iget-object v2, p0, Lbl/c;->x:Ljava/lang/Object;

    check-cast v2, Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v2, p1}, Lcom/google/crypto/tink/internal/l0;->V(Lwk/e;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lbl/c;->z:Ljava/lang/Object;

    check-cast v3, Lwe/o;

    monitor-enter v3

    :try_start_0
    iget-object v4, v3, Lwe/o;->w:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbl/b;

    if-nez v4, :cond_1

    iget-object v4, v3, Lwe/o;->x:Ljava/lang/Object;

    check-cast v4, Laj/d;

    iget-object v5, v4, Laj/d;->w:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayDeque;

    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v4, v4, Laj/d;->w:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbl/b;

    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v4, :cond_0

    :try_start_2
    new-instance v4, Lbl/b;

    invoke-direct {v4}, Lbl/b;-><init>()V

    :cond_0
    iget-object v5, v3, Lwe/o;->w:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1

    :cond_1
    :goto_0
    iget v5, v4, Lbl/b;->b:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, Lbl/b;->b:I

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object v3, v4, Lbl/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_5
    const-string v3, "DiskLruCacheWrapper"

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "DiskLruCacheWrapper"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " for for Key: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_6

    :cond_2
    :goto_1
    :try_start_6
    invoke-virtual {p0}, Lbl/c;->b()Ltk/d;

    move-result-object p1

    invoke-virtual {p1, v2}, Ltk/d;->s(Ljava/lang/String;)Lq30/u0;

    move-result-object v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v1, :cond_4

    :cond_3
    :goto_2
    iget-object p1, p0, Lbl/c;->z:Ljava/lang/Object;

    check-cast p1, Lwe/o;

    invoke-virtual {p1, v2}, Lwe/o;->P(Ljava/lang/String;)V

    return-void

    :cond_4
    :try_start_7
    invoke-virtual {p1, v2}, Ltk/d;->k(Ljava/lang/String;)Lb9/b;

    move-result-object p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz p1, :cond_6

    :try_start_8
    invoke-virtual {p1}, Lb9/b;->n()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p2, v0}, Lz63/d;->b(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lb9/b;->e()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p2

    goto :goto_4

    :cond_5
    :goto_3
    :try_start_9
    invoke-virtual {p1}, Lb9/b;->b()V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_5

    :goto_4
    invoke-virtual {p1}, Lb9/b;->b()V

    throw p2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :goto_5
    :try_start_a
    const-string p2, "DiskLruCacheWrapper"

    const/4 v0, 0x5

    invoke-static {p2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p2, "DiskLruCacheWrapper"

    const-string v0, "Unable to put to disk cache"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_2

    :goto_6
    iget-object p2, p0, Lbl/c;->z:Ljava/lang/Object;

    check-cast p2, Lwe/o;

    invoke-virtual {p2, v2}, Lwe/o;->P(Ljava/lang/String;)V

    throw p1

    :goto_7
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    throw p1
.end method

.method public n(Lwk/e;)Ljava/io/File;
    .locals 4

    iget-object v0, p0, Lbl/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->V(Lwk/e;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const-string v2, "DiskLruCacheWrapper"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Get: Obtained: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " for for Key: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lbl/c;->b()Ltk/d;

    move-result-object p1

    invoke-virtual {p1, v0}, Ltk/d;->s(Ljava/lang/String;)Lq30/u0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lq30/u0;->B()Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 v0, 0x5

    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Unable to get from disk cache"

    invoke-static {v2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
