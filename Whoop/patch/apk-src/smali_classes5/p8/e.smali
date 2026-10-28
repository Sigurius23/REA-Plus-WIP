.class public final Lp8/e;
.super Landroid/os/Handler;
.source "SourceFile"


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lp8/d;

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    return-void

    :cond_0
    iget-object p1, v0, Lp8/d;->a:Lp8/a;

    return-void

    :cond_1
    iget-object p1, v0, Lp8/d;->a:Lp8/a;

    iget-object v0, v0, Lp8/d;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p1, Lp8/a;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v0, p1, Lp8/a;->F:Ljava/util/concurrent/CountDownLatch;

    :try_start_0
    iget-object v1, p1, Lp8/a;->G:Lro/d;

    iget-object v3, v1, Lro/d;->j:Lp8/a;

    if-ne v3, p1, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    iput-object v2, v1, Lro/d;->j:Lp8/a;

    invoke-virtual {v1}, Lro/d;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw p1

    :cond_3
    :try_start_1
    iget-object v1, p1, Lp8/a;->G:Lro/d;

    iget-object v3, v1, Lro/d;->i:Lp8/a;

    if-eq v3, p1, :cond_4

    iget-object v0, v1, Lro/d;->j:Lp8/a;

    if-ne v0, p1, :cond_6

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    iput-object v2, v1, Lro/d;->j:Lp8/a;

    invoke-virtual {v1}, Lro/d;->c()V

    goto :goto_0

    :cond_4
    iget-boolean v3, v1, Lro/d;->e:Z

    if-eqz v3, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    iput-object v2, v1, Lro/d;->i:Lp8/a;

    iget v2, v1, Lro/d;->k:I

    packed-switch v2, :pswitch_data_0

    invoke-virtual {v1, v0}, Lro/d;->b(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_0
    check-cast v0, Ljava/util/List;

    iput-object v0, v1, Lro/d;->l:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lro/d;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_6
    :goto_0
    iget-object v0, p1, Lp8/a;->F:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :goto_1
    const/4 v0, 0x3

    iput v0, p1, Lp8/a;->y:I

    return-void

    :catchall_1
    move-exception v0

    iget-object p1, p1, Lp8/a;->F:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
