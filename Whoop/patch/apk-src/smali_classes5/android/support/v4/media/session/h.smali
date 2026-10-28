.class public final Landroid/support/v4/media/session/h;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/os/Looper;I)V
    .locals 0

    iput p3, p0, Landroid/support/v4/media/session/h;->a:I

    iput-object p1, p0, Landroid/support/v4/media/session/h;->b:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method private final a(Landroid/os/Message;)V
    .locals 11

    iget-object v0, p0, Landroid/support/v4/media/session/h;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li9/d;

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v2, :cond_9

    const/4 v2, 0x2

    if-eq v0, v2, :cond_6

    const/4 v2, 0x3

    if-eq v0, v2, :cond_5

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    iget-object v0, v1, Li9/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Ljava/lang/IllegalStateException;

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    goto/16 :goto_2

    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/os/Bundle;

    :try_start_0
    iget-object v0, v1, Li9/d;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    iget-object v0, v1, Li9/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_3
    invoke-virtual {v0, v3, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_5
    iget-object p1, v1, Li9/d;->e:Lb9/m1;

    invoke-virtual {p1}, Lb9/m1;->c()Z

    goto :goto_2

    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Li9/c;

    iget v5, v2, Li9/c;->a:I

    iget-object v7, v2, Li9/c;->c:Landroid/media/MediaCodec$CryptoInfo;

    iget-wide v8, v2, Li9/c;->d:J

    iget v10, v2, Li9/c;->e:I

    :try_start_1
    sget-object p1, Li9/d;->h:Ljava/lang/Object;

    monitor-enter p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v4, v1, Li9/d;->a:Landroid/media/MediaCodec;

    const/4 v6, 0x0

    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    move-exception v0

    move-object p1, v0

    iget-object v4, v1, Li9/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_7
    invoke-virtual {v4, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    :goto_0
    move-object v3, v2

    goto :goto_2

    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Li9/c;

    iget v5, p1, Li9/c;->a:I

    iget v7, p1, Li9/c;->b:I

    iget-wide v8, p1, Li9/c;->d:J

    iget v10, p1, Li9/c;->e:I

    :try_start_4
    iget-object v4, v1, Li9/d;->a:Landroid/media/MediaCodec;

    const/4 v6, 0x0

    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    iget-object v1, v1, Li9/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_a
    invoke-virtual {v1, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_1

    :cond_b
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_a

    :goto_1
    move-object v3, p1

    :goto_2
    if-eqz v3, :cond_c

    sget-object p1, Li9/d;->g:Ljava/util/ArrayDeque;

    monitor-enter p1

    :try_start_5
    invoke-virtual {p1, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    monitor-exit p1

    goto :goto_3

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :cond_c
    :goto_3
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    iget v0, p0, Landroid/support/v4/media/session/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroid/support/v4/media/session/h;->b:Ljava/lang/Object;

    check-cast p1, Lq8/b;

    :cond_1
    iget-object v1, p1, Lq8/b;->b:Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    iget-object v0, p1, Lq8/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    monitor-exit v1

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_2
    new-array v2, v0, [Lpg3/p;

    iget-object v3, p1, Lq8/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object v3, p1, Lq8/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    move v3, v1

    :goto_1
    if-ge v3, v0, :cond_1

    aget-object v4, v2, v3

    iget-object v5, v4, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v1

    :goto_2
    if-ge v6, v5, :cond_4

    iget-object v7, v4, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq8/a;

    iget-boolean v8, v7, Lq8/a;->d:Z

    if-nez v8, :cond_3

    iget-object v7, v7, Lq8/a;->b:Landroid/content/BroadcastReceiver;

    iget-object v8, p1, Lq8/b;->a:Landroid/content/Context;

    iget-object v9, v4, Lpg3/p;->x:Ljava/lang/Object;

    check-cast v9, Landroid/content/Intent;

    invoke-virtual {v7, v8, v9}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :pswitch_0
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/h;->a(Landroid/os/Message;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroid/support/v4/media/session/h;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhn/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x0

    if-eqz v0, :cond_b

    const/4 v3, 0x1

    if-eq v0, v3, :cond_8

    const/4 v3, 0x2

    if-eq v0, v3, :cond_7

    iget-object v0, v1, Lhn/e;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v3, Ljava/lang/IllegalStateException;

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_6

    :cond_7
    iget-object p1, v1, Lhn/e;->e:Lb9/m1;

    invoke-virtual {p1}, Lb9/m1;->c()Z

    goto :goto_6

    :cond_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lhn/d;

    iget v5, v3, Lhn/d;->a:I

    iget-object v7, v3, Lhn/d;->c:Landroid/media/MediaCodec$CryptoInfo;

    iget-wide v8, v3, Lhn/d;->d:J

    iget v10, v3, Lhn/d;->e:I

    :try_start_2
    sget-object p1, Lhn/e;->h:Ljava/lang/Object;

    monitor-enter p1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    iget-object v4, v1, Lhn/e;->a:Landroid/media/MediaCodec;

    const/4 v6, 0x0

    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    monitor-exit p1

    goto :goto_4

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    move-object p1, v0

    iget-object v4, v1, Lhn/e;->d:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_9
    invoke-virtual {v4, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_9

    :goto_4
    move-object v2, v3

    goto :goto_6

    :cond_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lhn/d;

    iget v5, v3, Lhn/d;->a:I

    iget v7, v3, Lhn/d;->b:I

    iget-wide v8, v3, Lhn/d;->d:J

    iget v10, v3, Lhn/d;->e:I

    :try_start_5
    iget-object v4, v1, Lhn/e;->a:Landroid/media/MediaCodec;

    const/4 v6, 0x0

    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_5

    :catch_1
    move-exception v0

    move-object p1, v0

    iget-object v1, v1, Lhn/e;->d:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_c
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_5

    :cond_d
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_c

    :goto_5
    goto :goto_4

    :goto_6
    if-eqz v2, :cond_e

    sget-object p1, Lhn/e;->g:Ljava/util/ArrayDeque;

    monitor-enter p1

    :try_start_6
    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    monitor-exit p1

    goto :goto_7

    :catchall_2
    move-exception v0

    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v0

    :cond_e
    :goto_7
    return-void

    :pswitch_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_10

    iget-object v0, p0, Landroid/support/v4/media/session/h;->b:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v1, v0, La00/g;->x:Ljava/lang/Object;

    monitor-enter v1

    :try_start_7
    iget-object v0, p0, Landroid/support/v4/media/session/h;->b:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/session/j;

    iget-object v2, p0, Landroid/support/v4/media/session/h;->b:Ljava/lang/Object;

    check-cast v2, La00/g;

    iget-object v3, v2, La00/g;->E:Ljava/lang/Object;

    check-cast v3, Landroid/support/v4/media/session/h;

    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    if-eqz v0, :cond_10

    invoke-interface {v0}, Landroid/support/v4/media/session/j;->b()La00/g;

    move-result-object v1

    if-ne v2, v1, :cond_10

    if-nez v3, :cond_f

    goto :goto_8

    :cond_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lr8/a;

    invoke-interface {v0, p1}, Landroid/support/v4/media/session/j;->a(Lr8/a;)V

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Landroid/support/v4/media/session/j;->a(Lr8/a;)V

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object p1, v0

    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw p1

    :cond_10
    :goto_8
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
