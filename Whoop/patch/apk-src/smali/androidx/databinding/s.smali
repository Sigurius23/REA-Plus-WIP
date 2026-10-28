.class public final Landroidx/databinding/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Landroidx/databinding/s;->w:I

    iput-object p1, p0, Landroidx/databinding/s;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v1, p0

    iget v0, v1, Landroidx/databinding/s;->w:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    :try_start_0
    iget-object v2, v0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    move-result-object v2

    check-cast v2, Lzk/a;

    invoke-virtual {v0, v2}, Lzt/q;->r(Lzk/a;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0

    :pswitch_0
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lyd3/d;

    monitor-enter v4

    :try_start_1
    iget v0, v4, Lyd3/d;->g:I

    add-int/2addr v0, v2

    iput v0, v4, Lyd3/d;->g:I

    invoke-virtual {v4}, Lyd3/d;->b()Lyd3/a;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    monitor-exit v4

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v5

    :cond_1
    move-object v6, v0

    const-wide/16 v7, -0x1

    :try_start_2
    iget-object v0, v6, Lyd3/a;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Lyd3/d;

    iget-object v9, v0, Lyd3/d;->b:Ljava/util/logging/Logger;

    iget-object v10, v6, Lyd3/a;->c:Lyd3/c;

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v9, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v12

    const-string v0, "starting"

    invoke-static {v9, v6, v10, v0}, Ls93/h;->b(Ljava/util/logging/Logger;Lyd3/a;Lyd3/c;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    move-wide v12, v7

    :goto_1
    :try_start_3
    invoke-virtual {v6}, Lyd3/a;->a()J

    move-result-wide v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v11, :cond_3

    :try_start_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v16

    sub-long v16, v16, v12

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "finished run in "

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v17}, Ls93/h;->o(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v6, v10, v0}, Ls93/h;->b(Ljava/util/logging/Logger;Lyd3/a;Lyd3/c;Ljava/lang/String;)V

    :cond_3
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lyd3/d;

    monitor-enter v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {v9, v6, v14, v15, v2}, Lyd3/d;->a(Lyd3/d;Lyd3/a;JZ)V

    invoke-virtual {v9}, Lyd3/d;->b()Lyd3/a;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    monitor-exit v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez v0, :cond_1

    :goto_2
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    goto :goto_4

    :catchall_1
    move-exception v0

    :try_start_7
    monitor-exit v9

    throw v0

    :catchall_2
    move-exception v0

    if-eqz v11, :cond_4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v14

    sub-long/2addr v14, v12

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "failed a run in "

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14, v15}, Ls93/h;->o(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v6, v10, v2}, Ls93/h;->b(Ljava/util/logging/Logger;Lyd3/a;Lyd3/c;Ljava/lang/String;)V

    :cond_4
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_3
    :try_start_8
    iget-object v2, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v2, Lyd3/d;

    monitor-enter v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    invoke-static {v2, v6, v7, v8, v3}, Lyd3/d;->a(Lyd3/d;Lyd3/a;JZ)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    monitor-exit v2

    instance-of v2, v0, Ljava/lang/InterruptedException;

    if-eqz v2, :cond_5

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_2

    :goto_4
    return-void

    :catchall_3
    move-exception v0

    goto :goto_5

    :cond_5
    throw v0

    :catchall_4
    move-exception v0

    monitor-exit v2

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :goto_5
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v0

    :catchall_5
    move-exception v0

    monitor-exit v4

    throw v0

    :pswitch_1
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Lm/a0;

    iget v4, v0, Lm/a0;->z0:I

    and-int/2addr v2, v4

    if-eqz v2, :cond_6

    invoke-virtual {v0, v3}, Lm/a0;->A(I)V

    :cond_6
    iget v2, v0, Lm/a0;->z0:I

    and-int/lit16 v2, v2, 0x1000

    if-eqz v2, :cond_7

    const/16 v2, 0x6c

    invoke-virtual {v0, v2}, Lm/a0;->A(I)V

    :cond_7
    iput-boolean v3, v0, Lm/a0;->y0:Z

    iput v3, v0, Lm/a0;->z0:I

    return-void

    :pswitch_2
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/k0;

    :cond_8
    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/k0;->x()V

    iget-object v2, v0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v2

    const/16 v4, 0x3e8

    if-ge v2, v4, :cond_8

    iget-object v2, v0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v2, Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_b
    iget-object v4, v0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/internal/k0;->K(Z)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_6

    :catchall_6
    move-exception v0

    move-object v3, v0

    goto :goto_7

    :cond_9
    :goto_6
    invoke-virtual {v2}, Lio/sentry/s;->close()V

    return-void

    :goto_7
    :try_start_c
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    goto :goto_8

    :catchall_7
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v3

    :pswitch_3
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_a

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "Cache dir is not set, not moving the previous session."

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v0, v2, v4, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_9

    :cond_a
    invoke-virtual {v0}, Lio/sentry/q6;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    move-result-object v0

    instance-of v3, v0, Lio/sentry/cache/c;

    if-eqz v3, :cond_b

    sget v3, Lio/sentry/cache/c;->J:I

    new-instance v3, Ljava/io/File;

    const-string v4, "session.json"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/io/File;

    const-string v5, "previous_session.json"

    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v0, Lio/sentry/cache/c;

    invoke-virtual {v0, v3, v4}, Lio/sentry/cache/c;->d(Ljava/io/File;Ljava/io/File;)V

    iget-object v0, v0, Lio/sentry/cache/c;->E:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_b
    :goto_9
    return-void

    :pswitch_4
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Leh3/b;

    iget-object v2, v0, Leh3/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Leh3/d;

    iget-wide v7, v6, Leh3/d;->I:J

    cmp-long v7, v7, v3

    if-gtz v7, :cond_d

    invoke-virtual {v2, v6}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    iget-object v7, v0, Leh3/b;->d:Lmh3/c;

    invoke-virtual {v7, v6}, Lmh3/c;->e(Lxg3/t;)V

    goto :goto_a

    :cond_d
    return-void

    :pswitch_5
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/g;

    iput-boolean v3, v0, Lcom/iterable/iterableapi/g;->d:Z

    iget-object v0, v0, Lcom/iterable/iterableapi/g;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/iterable/iterableapi/f;

    invoke-interface {v2}, Lcom/iterable/iterableapi/f;->a()V

    goto :goto_b

    :cond_f
    return-void

    :pswitch_6
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v5, v0, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    if-eqz v5, :cond_13

    invoke-virtual {v5, v3}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v0

    const/4 v4, 0x3

    if-ne v0, v4, :cond_10

    move v3, v2

    :cond_10
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v3, :cond_11

    const/16 v3, 0xa

    if-eq v0, v3, :cond_13

    if-eq v0, v2, :cond_13

    goto :goto_c

    :cond_11
    if-eq v0, v2, :cond_13

    :goto_c
    const/4 v2, 0x7

    if-eq v0, v2, :cond_12

    const/16 v3, 0x9

    if-eq v0, v3, :cond_12

    const/4 v2, 0x2

    :cond_12
    move v6, v2

    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-wide v7, v4, Landroidx/compose/ui/platform/AndroidComposeView;->T0:J

    const/4 v9, 0x0

    invoke-virtual/range {v4 .. v9}, Landroidx/compose/ui/platform/AndroidComposeView;->M(Landroid/view/MotionEvent;IJZ)V

    :cond_13
    return-void

    :pswitch_7
    monitor-enter p0

    :try_start_d
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/databinding/a0;

    invoke-static {v0, v3}, Landroidx/databinding/a0;->access$202(Landroidx/databinding/a0;Z)Z

    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    invoke-static {}, Landroidx/databinding/a0;->access$300()V

    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/databinding/a0;

    invoke-static {v0}, Landroidx/databinding/a0;->access$400(Landroidx/databinding/a0;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_14

    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/databinding/a0;

    invoke-static {v0}, Landroidx/databinding/a0;->access$400(Landroidx/databinding/a0;)Landroid/view/View;

    move-result-object v0

    invoke-static {}, Landroidx/databinding/a0;->access$500()Landroid/view/View$OnAttachStateChangeListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/databinding/a0;

    invoke-static {v0}, Landroidx/databinding/a0;->access$400(Landroidx/databinding/a0;)Landroid/view/View;

    move-result-object v0

    invoke-static {}, Landroidx/databinding/a0;->access$500()Landroid/view/View$OnAttachStateChangeListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    goto :goto_d

    :cond_14
    iget-object v0, v1, Landroidx/databinding/s;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/databinding/a0;

    invoke-virtual {v0}, Landroidx/databinding/a0;->executePendingBindings()V

    :goto_d
    return-void

    :catchall_8
    move-exception v0

    :try_start_e
    monitor-exit p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
