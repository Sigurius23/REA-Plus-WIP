.class public final Lcq/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcq/m;->w:I

    iput-object p3, p0, Lcq/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Lcq/m;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lht/j;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lcq/m;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcq/m;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 2
    iput p4, p0, Lcq/m;->w:I

    iput-object p1, p0, Lcq/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Lcq/m;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 4

    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lrc/c;

    iget-object v0, v0, Lrc/c;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v1, Lrc/c;

    iget-object v1, v1, Lrc/c;->z:Lv/a;

    iget-object v2, p0, Lcq/m;->x:Ljava/lang/Object;

    invoke-interface {v1, v2}, Lv/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v2, Lrc/c;

    iget-object v3, v2, Lrc/c;->w:Ljava/lang/Object;

    if-nez v3, :cond_0

    if-eqz v1, :cond_0

    iput-object v1, v2, Lrc/c;->w:Ljava/lang/Object;

    iget-object v2, v2, Lrc/c;->E:Landroidx/lifecycle/t0;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v2, Lrc/c;

    iput-object v1, v2, Lrc/c;->w:Ljava/lang/Object;

    iget-object v2, v2, Lrc/c;->E:Landroidx/lifecycle/t0;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private final b()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/room/u1;

    iget-object v0, v0, Landroidx/room/u1;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/room/u1;

    invoke-virtual {v1}, Landroidx/room/u1;->a()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/room/u1;

    iget-object v1, v1, Landroidx/room/u1;->E:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2
    iget-object v2, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v2, Landroidx/room/u1;

    invoke-virtual {v2}, Landroidx/room/u1;->a()V

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0
.end method

.method private final c()V
    .locals 4

    iget-object v0, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v0, Lso/m;

    iget-object v1, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v1, Landroid/os/IBinder;

    monitor-enter v0

    if-nez v1, :cond_0

    :try_start_0
    const-string v1, "Null service connection"

    invoke-virtual {v0, v1}, Lso/m;->a(Ljava/lang/String;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v2, Lpg3/o;

    invoke-direct {v2, v1}, Lpg3/o;-><init>(Landroid/os/IBinder;)V

    iput-object v2, v0, Lso/m;->y:Lpg3/o;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x2

    :try_start_2
    iput v1, v0, Lso/m;->w:I

    iget-object v1, v0, Lso/m;->F:Lso/o;

    iget-object v1, v1, Lso/o;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lso/k;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lso/k;-><init>(Lso/m;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lso/m;->a(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private final d()V
    .locals 5

    iget-object v0, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v0, Lso/m;

    iget-object v1, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v1, Lso/n;

    iget v1, v1, Lso/n;->a:I

    const-string v2, "Timing out request: "

    monitor-enter v0

    :try_start_0
    iget-object v3, v0, Lso/m;->E:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lso/n;

    if-eqz v3, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "MessengerIpcClient"

    invoke-static {v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, v0, Lso/m;->E:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->remove(I)V

    const-string v1, "Timed out waiting for response"

    new-instance v2, Lcom/google/android/gms/cloudmessaging/zzt;

    const/4 v4, 0x0

    invoke-direct {v2, v1, v4}, Lcom/google/android/gms/cloudmessaging/zzt;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v3, v2}, Lso/n;->b(Lcom/google/android/gms/cloudmessaging/zzt;)V

    invoke-virtual {v0}, Lso/m;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public e()V
    .locals 10

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget-object v2, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v2, Lht/j;

    iget-object v2, v2, Lht/j;->x:Ljava/util/ArrayDeque;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x1

    if-nez v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lht/j;

    iget v4, v0, Lht/j;->y:I

    const/4 v5, 0x4

    if-ne v4, v5, :cond_0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_0
    :try_start_2
    iget-wide v6, v0, Lht/j;->z:J

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    iput-wide v6, v0, Lht/j;->z:J

    iput v5, v0, Lht/j;->y:I

    move v0, v3

    :cond_1
    iget-object v4, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v4, Lht/j;

    iget-object v4, v4, Lht/j;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Runnable;

    iput-object v4, p0, Lcq/m;->x:Ljava/lang/Object;

    if-nez v4, :cond_3

    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lht/j;

    iput v3, v0, Lht/j;->y:I

    monitor-exit v2

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_2
    return-void

    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    or-int/2addr v1, v2

    const/4 v2, 0x0

    :try_start_4
    iget-object v3, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Runnable;

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    :try_start_5
    iput-object v2, p0, Lcq/m;->x:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_4

    :catch_0
    move-exception v3

    :try_start_6
    sget-object v4, Lht/j;->F:Ljava/util/logging/Logger;

    sget-object v5, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Exception while executing runnable "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Runnable;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_3

    :goto_4
    :try_start_7
    iput-object v2, p0, Lcq/m;->x:Ljava/lang/Object;

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_5
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :goto_6
    if-eqz v1, :cond_4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    throw v0
.end method

.method public final run()V
    .locals 6

    iget v0, p0, Lcq/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/a;

    iget-object v1, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v1, Lcd3/g;

    iget-object v2, v1, Lcd3/g;->F:Ljava/lang/Object;

    check-cast v2, Lto/f;

    iget-object v3, v1, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/common/api/d;

    iget-object v2, v2, Lto/f;->J:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v4, v1, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v4, Lto/a;

    invoke-virtual {v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/v;

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/common/a;->b()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, v1, Lcd3/g;->w:Z

    invoke-interface {v3}, Lcom/google/android/gms/common/api/d;->a()Z

    move-result v0

    if-nez v0, :cond_2

    :try_start_0
    move-object v0, v3

    check-cast v0, Luo/h;

    invoke-virtual {v0}, Luo/c;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Luo/h;->y:Ljava/util/Set;

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    :goto_0
    move-object v1, v3

    check-cast v1, Luo/c;

    invoke-virtual {v1, v5, v0}, Luo/c;->i(Luo/i;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "GoogleApiManager"

    const-string v4, "Failed to get service from broker. "

    invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string v0, "Failed to get service from broker."

    check-cast v3, Luo/c;

    invoke-virtual {v3, v0}, Luo/c;->f(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/common/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/a;-><init>(I)V

    invoke-virtual {v2, v0, v5}, Lto/v;->l(Lcom/google/android/gms/common/a;Ljava/lang/RuntimeException;)V

    goto :goto_1

    :cond_2
    iget-boolean v0, v1, Lcd3/g;->w:Z

    if-eqz v0, :cond_4

    iget-object v0, v1, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v0, Luo/i;

    if-eqz v0, :cond_4

    iget-object v1, v1, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    check-cast v3, Luo/c;

    invoke-virtual {v3, v0, v1}, Luo/c;->i(Luo/i;Ljava/util/Set;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v0, v5}, Lto/v;->l(Lcom/google/android/gms/common/a;Ljava/lang/RuntimeException;)V

    :cond_4
    :goto_1
    return-void

    :pswitch_0
    invoke-direct {p0}, Lcq/m;->d()V

    return-void

    :pswitch_1
    invoke-direct {p0}, Lcq/m;->c()V

    return-void

    :pswitch_2
    invoke-direct {p0}, Lcq/m;->b()V

    return-void

    :pswitch_3
    invoke-direct {p0}, Lcq/m;->a()V

    return-void

    :pswitch_4
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v1, Lkc/a;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Scheduling work "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v3, Lqc/q;

    iget-object v4, v3, Lqc/q;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lkc/a;

    iget-object v0, v0, Lkc/a;->a:Lkc/c;

    filled-new-array {v3}, [Lqc/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkc/c;->e([Lqc/q;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/m;

    iget-object v1, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v1, Lds/v;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :goto_2
    :try_start_1
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_6

    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    :cond_6
    invoke-virtual {v0, v1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    goto :goto_4

    :catch_1
    move-exception v1

    goto :goto_3

    :catchall_0
    move-exception v1

    if-eqz v2, :cond_7

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    :cond_7
    throw v1
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_4
    return-void

    :catch_2
    const/4 v2, 0x1

    goto :goto_2

    :pswitch_6
    :try_start_3
    invoke-virtual {p0}, Lcq/m;->e()V
    :try_end_3
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_3

    return-void

    :catch_3
    move-exception v0

    iget-object v1, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v1, Lht/j;

    iget-object v1, v1, Lht/j;->x:Ljava/util/ArrayDeque;

    monitor-enter v1

    :try_start_4
    iget-object v2, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v2, Lht/j;

    const/4 v3, 0x1

    iput v3, v2, Lht/j;->y:I

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :pswitch_7
    const/4 v0, 0x0

    :cond_8
    :try_start_6
    iget-object v1, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v1

    :try_start_7
    sget-object v2, Lq83/k;->w:Lq83/k;

    invoke-static {v2, v1}, Lbc3/f0;->u(Lq83/j;Ljava/lang/Throwable;)V

    :goto_5
    iget-object v1, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v1, Lhc3/g;

    invoke-virtual {v1}, Lhc3/g;->s()Ljava/lang/Runnable;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_6

    :cond_9
    iput-object v1, p0, Lcq/m;->x:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_8

    iget-object v1, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v1, Lhc3/g;

    iget-object v2, v1, Lhc3/g;->x:Lbc3/z;

    invoke-static {v2, v1}, Lhc3/b;->i(Lbc3/z;Lq83/j;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lhc3/g;

    iget-object v1, v0, Lhc3/g;->x:Lbc3/z;

    invoke-static {v1, v0, p0}, Lhc3/b;->h(Lbc3/z;Lq83/j;Ljava/lang/Runnable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :goto_6
    return-void

    :catchall_3
    move-exception v0

    iget-object v1, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v1, Lhc3/g;

    iget-object v2, v1, Lhc3/g;->F:Ljava/lang/Object;

    monitor-enter v2

    :try_start_8
    sget-object v3, Lhc3/g;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    monitor-exit v2

    throw v0

    :catchall_4
    move-exception v0

    monitor-exit v2

    throw v0

    :pswitch_8
    iget-object v0, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v0, Lcq/u;

    :try_start_9
    iget-object v1, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcq/u;->a(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_9

    :catchall_5
    move-exception v1

    goto :goto_7

    :catch_4
    move-exception v1

    goto :goto_8

    :goto_7
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Lcq/u;->c(Ljava/lang/Exception;)V

    goto :goto_9

    :goto_8
    invoke-virtual {v0, v1}, Lcq/u;->c(Ljava/lang/Exception;)V

    :goto_9
    return-void

    :pswitch_9
    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lcq/o;

    :try_start_a
    iget-object v1, v0, Lcq/o;->y:Ljava/lang/Object;

    check-cast v1, Lcq/h;

    iget-object v2, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lcq/h;->i(Ljava/lang/Object;)Lcq/u;

    move-result-object v1
    :try_end_a
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_a .. :try_end_a} :catch_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_7
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    sget-object v2, Lcq/j;->b:Lcq/r;

    invoke-virtual {v1, v2, v0}, Lcq/u;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v1, v2, v0}, Lcq/u;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcq/e;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v1, v2, v0}, Lcq/u;->addOnCanceledListener(Ljava/util/concurrent/Executor;Lcq/c;)Lcom/google/android/gms/tasks/Task;

    goto :goto_c

    :catch_5
    move-exception v1

    goto :goto_a

    :catch_6
    move-exception v1

    goto :goto_b

    :goto_a
    invoke-virtual {v0, v1}, Lcq/o;->n(Ljava/lang/Exception;)V

    goto :goto_c

    :catch_7
    invoke-virtual {v0}, Lcq/o;->d()V

    goto :goto_c

    :goto_b
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/Exception;

    if-eqz v2, :cond_a

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    check-cast v1, Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Lcq/o;->n(Ljava/lang/Exception;)V

    goto :goto_c

    :cond_a
    invoke-virtual {v0, v1}, Lcq/o;->n(Ljava/lang/Exception;)V

    :goto_c
    return-void

    :pswitch_a
    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lcq/o;

    iget-object v1, v0, Lcq/o;->y:Ljava/lang/Object;

    monitor-enter v1

    :try_start_b
    iget-object v0, v0, Lcq/o;->z:Ljava/lang/Object;

    check-cast v0, Lcq/f;

    if-eqz v0, :cond_b

    iget-object v2, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Lcq/f;->onSuccess(Ljava/lang/Object;)V

    goto :goto_d

    :catchall_6
    move-exception v0

    goto :goto_e

    :cond_b
    :goto_d
    monitor-exit v1

    return-void

    :goto_e
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    throw v0

    :pswitch_b
    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lcq/o;

    iget-object v1, v0, Lcq/o;->y:Ljava/lang/Object;

    monitor-enter v1

    :try_start_c
    iget-object v0, v0, Lcq/o;->z:Ljava/lang/Object;

    check-cast v0, Lcq/d;

    if-eqz v0, :cond_c

    iget-object v2, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/tasks/Task;

    invoke-interface {v0, v2}, Lcq/d;->q(Lcom/google/android/gms/tasks/Task;)V

    goto :goto_f

    :catchall_7
    move-exception v0

    goto :goto_10

    :cond_c
    :goto_f
    monitor-exit v1

    return-void

    :goto_10
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    throw v0

    :pswitch_c
    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lcq/n;

    :try_start_d
    iget-object v1, v0, Lcq/n;->y:Lcq/b;

    iget-object v2, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/tasks/Task;

    invoke-interface {v1, v2}, Lcq/b;->a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/tasks/Task;
    :try_end_d
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_d .. :try_end_d} :catch_9
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_8

    if-nez v1, :cond_d

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcq/n;->n(Ljava/lang/Exception;)V

    goto :goto_13

    :cond_d
    sget-object v2, Lcq/j;->b:Lcq/r;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcq/e;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/tasks/Task;->addOnCanceledListener(Ljava/util/concurrent/Executor;Lcq/c;)Lcom/google/android/gms/tasks/Task;

    goto :goto_13

    :catch_8
    move-exception v1

    goto :goto_11

    :catch_9
    move-exception v1

    goto :goto_12

    :goto_11
    iget-object v0, v0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0, v1}, Lcq/u;->c(Ljava/lang/Exception;)V

    goto :goto_13

    :goto_12
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/Exception;

    if-eqz v2, :cond_e

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    check-cast v1, Ljava/lang/Exception;

    iget-object v0, v0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0, v1}, Lcq/u;->c(Ljava/lang/Exception;)V

    goto :goto_13

    :cond_e
    iget-object v0, v0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0, v1}, Lcq/u;->c(Ljava/lang/Exception;)V

    :goto_13
    return-void

    :pswitch_d
    iget-object v0, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v0, Lcq/n;

    iget-object v1, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v0, v0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0}, Lcq/u;->d()V

    goto :goto_16

    :cond_f
    :try_start_e
    iget-object v2, v0, Lcq/n;->y:Lcq/b;

    invoke-interface {v2, v1}, Lcq/b;->a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object v1
    :try_end_e
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_e .. :try_end_e} :catch_b
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_a

    iget-object v0, v0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0, v1}, Lcq/u;->a(Ljava/lang/Object;)V

    goto :goto_16

    :catch_a
    move-exception v1

    goto :goto_14

    :catch_b
    move-exception v1

    goto :goto_15

    :goto_14
    iget-object v0, v0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0, v1}, Lcq/u;->c(Ljava/lang/Exception;)V

    goto :goto_16

    :goto_15
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/Exception;

    if-eqz v2, :cond_10

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    check-cast v1, Ljava/lang/Exception;

    iget-object v0, v0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0, v1}, Lcq/u;->c(Ljava/lang/Exception;)V

    goto :goto_16

    :cond_10
    iget-object v0, v0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0, v1}, Lcq/u;->c(Ljava/lang/Exception;)V

    :goto_16
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcq/m;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcq/m;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    const-string v1, "}"

    if-eqz v0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SequentialExecutorWorker{running="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "SequentialExecutorWorker{state="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcq/m;->y:Ljava/lang/Object;

    check-cast v2, Lht/j;

    iget v2, v2, Lht/j;->y:I

    invoke-static {v2}, Lhc3/i;->A(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method
