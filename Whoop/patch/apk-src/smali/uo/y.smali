.class public final Luo/y;
.super Ljp/d;
.source "SourceFile"


# instance fields
.field public final synthetic a:Luo/c;


# direct methods
.method public constructor <init>(Luo/c;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Luo/y;->a:Luo/c;

    const/4 p1, 0x2

    invoke-direct {p0, p2, p1}, Ljp/d;-><init>(Landroid/os/Looper;I)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 10

    iget-object v0, p0, Luo/y;->a:Luo/c;

    iget-object v1, v0, Luo/c;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p1, Landroid/os/Message;->arg1:I

    const/4 v3, 0x7

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v1, v2, :cond_2

    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v4, :cond_1

    if-eq v0, v5, :cond_1

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Luo/u;

    if-eqz p1, :cond_19

    monitor-enter p1

    :try_start_0
    iput-object v6, p1, Luo/u;->a:Ljava/lang/Boolean;

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p1, Luo/u;->c:Luo/c;

    iget-object v1, v0, Luo/c;->k:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_1
    iget-object v0, v0, Luo/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_2
    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x4

    const/4 v7, 0x5

    if-eq v1, v5, :cond_4

    if-eq v1, v3, :cond_4

    if-ne v1, v2, :cond_3

    instance-of v8, v0, Lyp/e;

    if-eqz v8, :cond_4

    :cond_3
    if-ne v1, v7, :cond_5

    :cond_4
    invoke-virtual {v0}, Luo/c;->o()Z

    move-result v1

    if-eqz v1, :cond_18

    :cond_5
    iget v1, p1, Landroid/os/Message;->what:I

    const/16 v8, 0x8

    const/4 v9, 0x3

    if-ne v1, v2, :cond_9

    new-instance v1, Lcom/google/android/gms/common/a;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/a;-><init>(I)V

    iput-object v1, v0, Luo/c;->t:Lcom/google/android/gms/common/a;

    invoke-virtual {v0}, Luo/c;->s()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-boolean p1, v0, Luo/c;->u:Z

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v0, v9, v6}, Luo/c;->t(ILandroid/os/IInterface;)V

    return-void

    :cond_7
    :goto_1
    iget-object p1, v0, Luo/c;->t:Lcom/google/android/gms/common/a;

    if-eqz p1, :cond_8

    goto :goto_2

    :cond_8
    new-instance p1, Lcom/google/android/gms/common/a;

    invoke-direct {p1, v8}, Lcom/google/android/gms/common/a;-><init>(I)V

    :goto_2
    iget-object v0, v0, Luo/c;->i:Luo/b;

    invoke-interface {v0, p1}, Luo/b;->b(Lcom/google/android/gms/common/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void

    :cond_9
    if-ne v1, v7, :cond_b

    iget-object p1, v0, Luo/c;->t:Lcom/google/android/gms/common/a;

    if-eqz p1, :cond_a

    goto :goto_3

    :cond_a
    new-instance p1, Lcom/google/android/gms/common/a;

    invoke-direct {p1, v8}, Lcom/google/android/gms/common/a;-><init>(I)V

    :goto_3
    iget-object v0, v0, Luo/c;->i:Luo/b;

    invoke-interface {v0, p1}, Luo/b;->b(Lcom/google/android/gms/common/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void

    :cond_b
    if-ne v1, v9, :cond_d

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v2, v1, Landroid/app/PendingIntent;

    if-eqz v2, :cond_c

    move-object v6, v1

    check-cast v6, Landroid/app/PendingIntent;

    :cond_c
    new-instance v1, Lcom/google/android/gms/common/a;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, p1, v6}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    iget-object p1, v0, Luo/c;->i:Luo/b;

    invoke-interface {p1, v1}, Luo/b;->b(Lcom/google/android/gms/common/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void

    :cond_d
    const/4 v2, 0x6

    if-ne v1, v2, :cond_f

    invoke-virtual {v0, v7, v6}, Luo/c;->t(ILandroid/os/IInterface;)V

    iget-object v1, v0, Luo/c;->n:Luo/k;

    if-eqz v1, :cond_e

    iget p1, p1, Landroid/os/Message;->arg2:I

    iget-object v1, v1, Luo/k;->a:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/common/api/i;

    invoke-interface {v1, p1}, Lcom/google/android/gms/common/api/i;->X(I)V

    :cond_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-virtual {v0, v7, v5, v6}, Luo/c;->q(IILandroid/os/IInterface;)Z

    return-void

    :cond_f
    if-ne v1, v4, :cond_11

    invoke-virtual {v0}, Luo/c;->n()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_4

    :cond_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Luo/u;

    if-eqz p1, :cond_19

    monitor-enter p1

    :try_start_3
    iput-object v6, p1, Luo/u;->a:Ljava/lang/Boolean;

    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    iget-object v0, p1, Luo/u;->c:Luo/c;

    iget-object v1, v0, Luo/c;->k:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_4
    iget-object v0, v0, Luo/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_2
    move-exception p1

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    :catchall_3
    move-exception v0

    :try_start_5
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v0

    :cond_11
    :goto_4
    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v4, :cond_13

    if-eq v0, v5, :cond_13

    if-ne v0, v3, :cond_12

    goto :goto_5

    :cond_12
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x22

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "Don\'t know how to handle message: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const-string v1, "GmsClient"

    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_13
    :goto_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Luo/u;

    const-string p1, " being reused. This is not safe."

    const-string v1, "Callback proxy "

    monitor-enter v0

    :try_start_6
    iget-object v2, v0, Luo/u;->a:Ljava/lang/Boolean;

    iget-boolean v3, v0, Luo/u;->b:Z

    if-eqz v3, :cond_14

    const-string v3, "GmsClient"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x2f

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :catchall_4
    move-exception p1

    goto :goto_9

    :cond_14
    :goto_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    if-eqz v2, :cond_17

    iget-object p1, v0, Luo/u;->f:Luo/c;

    iget v1, v0, Luo/u;->d:I

    if-nez v1, :cond_15

    invoke-virtual {v0}, Luo/u;->a()Z

    move-result v1

    if-nez v1, :cond_17

    invoke-virtual {p1, v5, v6}, Luo/c;->t(ILandroid/os/IInterface;)V

    new-instance p1, Lcom/google/android/gms/common/a;

    invoke-direct {p1, v8, v6}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {v0, p1}, Luo/u;->b(Lcom/google/android/gms/common/a;)V

    goto :goto_8

    :cond_15
    invoke-virtual {p1, v5, v6}, Luo/c;->t(ILandroid/os/IInterface;)V

    iget-object p1, v0, Luo/u;->e:Landroid/os/Bundle;

    if-eqz p1, :cond_16

    const-string v2, "pendingIntent"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/app/PendingIntent;

    goto :goto_7

    :cond_16
    move-object p1, v6

    :goto_7
    new-instance v2, Lcom/google/android/gms/common/a;

    invoke-direct {v2, v1, p1}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {v0, v2}, Luo/u;->b(Lcom/google/android/gms/common/a;)V

    :cond_17
    :goto_8
    monitor-enter v0

    :try_start_7
    iput-boolean v5, v0, Luo/u;->b:Z

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    monitor-enter v0

    :try_start_8
    iput-object v6, v0, Luo/u;->a:Ljava/lang/Boolean;

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    iget-object p1, v0, Luo/u;->c:Luo/c;

    iget-object v1, p1, Luo/c;->k:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_9
    iget-object p1, p1, Luo/c;->k:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_5
    move-exception p1

    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    throw p1

    :catchall_6
    move-exception p1

    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    throw p1

    :catchall_7
    move-exception p1

    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    throw p1

    :goto_9
    :try_start_c
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    throw p1

    :cond_18
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Luo/u;

    if-eqz p1, :cond_19

    monitor-enter p1

    :try_start_d
    iput-object v6, p1, Luo/u;->a:Ljava/lang/Boolean;

    monitor-exit p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    iget-object v0, p1, Luo/u;->c:Luo/c;

    iget-object v1, v0, Luo/c;->k:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_e
    iget-object v0, v0, Luo/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_8
    move-exception p1

    monitor-exit v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    throw p1

    :catchall_9
    move-exception v0

    :try_start_f
    monitor-exit p1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    throw v0

    :cond_19
    return-void
.end method
