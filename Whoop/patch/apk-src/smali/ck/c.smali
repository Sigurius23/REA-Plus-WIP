.class public final Lck/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkk/e;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lck/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljk/a;)Ljk/a;
    .locals 9

    iget v0, p0, Lck/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Ljk/a;->O:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lck/c;->x:Ljava/lang/Object;

    check-cast v0, Lpg3/o;

    if-eqz v0, :cond_1

    sget-object v1, Lpk/d;->w:Lpk/d;

    new-instance v2, Lpk/a;

    invoke-virtual {p1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p1, Ljk/a;->N:Ljava/util/LinkedHashMap;

    iget-object v5, p1, Ljk/a;->O:Ljava/util/LinkedHashMap;

    iget-object v6, p1, Ljk/a;->P:Ljava/util/LinkedHashMap;

    iget-object v7, p1, Ljk/a;->Q:Ljava/util/LinkedHashMap;

    invoke-direct/range {v2 .. v7}, Lpk/a;-><init>(Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    iget-object v3, v0, Lpg3/o;->w:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v0, v0, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    new-instance v4, Lpk/b;

    invoke-direct {v4}, Lpk/b;-><init>()V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v4, Lpk/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    iget-object v1, v4, Lpk/b;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v0, v4, Lpk/b;->b:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    monitor-exit v1

    throw p1

    :goto_1
    monitor-exit v3

    throw p1

    :cond_1
    const-string p1, "eventBridge"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_2
    return-object p1

    :pswitch_0
    iget-object v0, p1, Ljk/a;->O:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {p1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "$exposure"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_6

    :cond_3
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Ljava/util/Map;

    if-eqz v4, :cond_4

    :try_start_2
    check-cast v0, Ljava/util/Map;

    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lck/c;->x:Ljava/lang/Object;

    check-cast v0, Lfj/a;

    if-eqz v0, :cond_e

    iget-object v0, v0, Lfj/a;->a:Lzt/q;

    iget-object v2, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_3
    iget-object v3, v0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v3, Lfj/b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    iget-object v2, v3, Lfj/b;->a:Ljava/lang/String;

    iget-object v4, v3, Lfj/b;->b:Ljava/lang/String;

    iget-object v3, v3, Lfj/b;->c:Ljava/util/Map;

    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    const v8, 0x1219be

    if-eq v7, v8, :cond_b

    const v8, 0x8ba2838

    if-eq v7, v8, :cond_9

    const v8, 0x4412f185

    if-eq v7, v8, :cond_7

    goto :goto_4

    :cond_7
    const-string v7, "$unset"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_4

    :cond_8
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_9
    const-string v5, "$clearAll"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    goto :goto_4

    :cond_b
    const-string v7, "$set"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    goto :goto_4

    :cond_c
    invoke-interface {v3, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto :goto_4

    :cond_d
    new-instance v1, Lfj/b;

    invoke-direct {v1, v2, v4, v3}, Lfj/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lzt/q;->H(Lfj/b;)V

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object p1, v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw p1

    :cond_e
    const-string p1, "connector"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_f
    :goto_6
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lgj/d;)V
    .locals 3

    iget v0, p0, Lck/c;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lpk/c;->b:Ljava/lang/Object;

    iget-object p1, p1, Lgj/d;->a:Lgj/g;

    iget-object p1, p1, Lgj/g;->e:Ljava/lang/String;

    const-string v0, "instanceName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpk/c;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lpk/c;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Lpk/c;

    invoke-direct {v2}, Lpk/c;-><init>()V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v2, Lpk/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object p1, v2, Lpk/c;->a:Lpg3/o;

    iput-object p1, p0, Lck/c;->x:Ljava/lang/Object;

    return-void

    :goto_1
    monitor-exit v0

    throw p1

    :pswitch_0
    iget-object p1, p1, Lgj/d;->a:Lgj/g;

    iget-object p1, p1, Lgj/g;->e:Ljava/lang/String;

    sget-object v0, Lfj/a;->c:Ljava/lang/Object;

    invoke-static {p1}, Lq83/g;->z(Ljava/lang/String;)Lfj/a;

    move-result-object p1

    iput-object p1, p0, Lck/c;->x:Ljava/lang/Object;

    iget-object p1, p1, Lfj/a;->b:Lcom/google/crypto/tink/internal/l0;

    new-instance v0, Lck/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    iget-object v1, p1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/ArrayBlockingQueue;->drainTo(Ljava/util/Collection;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v1

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lck/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_2
    return-void

    :catchall_1
    move-exception p1

    monitor-exit v1

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getType()Lkk/d;
    .locals 1

    iget v0, p0, Lck/c;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lkk/d;->w:Lkk/d;

    return-object v0

    :pswitch_0
    sget-object v0, Lkk/d;->w:Lkk/d;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
