.class public abstract Lzt/h;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private E:I

.field final w:Ljava/util/concurrent/ExecutorService;

.field private x:Landroid/os/Binder;

.field private final y:Ljava/lang/Object;

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v7, Lap/b;

    const-string v0, "Firebase-Messaging-Intent-Handle"

    invoke-direct {v7, v0}, Lap/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x1

    const-wide/16 v3, 0x3c

    move v2, v1

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lzt/h;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lzt/h;->y:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lzt/h;->E:I

    return-void
.end method

.method public static a(Lzt/h;Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    invoke-virtual {p0, p1}, Lzt/h;->e(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcq/i;

    invoke-direct {v0}, Lcq/i;-><init>()V

    iget-object v1, p0, Lzt/h;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lh6/l;

    const/4 v3, 0x7

    invoke-direct {v2, p0, p1, v0, v3}, Lh6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object p0, v0, Lcq/i;->a:Lcq/u;

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Intent;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lzt/z;->b(Landroid/content/Intent;)V

    :cond_0
    iget-object p1, p0, Lzt/h;->y:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, p0, Lzt/h;->E:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lzt/h;->E:I

    if-nez v0, :cond_1

    iget v0, p0, Lzt/h;->z:I

    invoke-virtual {p0, v0}, Lzt/h;->f(I)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public abstract c(Landroid/content/Intent;)Landroid/content/Intent;
.end method

.method public abstract d(Landroid/content/Intent;)V
.end method

.method public e(Landroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public f(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/app/Service;->stopSelfResult(I)Z

    move-result p1

    return p1
.end method

.method public final declared-synchronized onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string p1, "EnhancedIntentService"

    const/4 v0, 0x3

    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "EnhancedIntentService"

    const-string v0, "Service received bind request"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lzt/h;->x:Landroid/os/Binder;

    if-nez p1, :cond_1

    new-instance p1, Lzt/a0;

    new-instance v0, Lzd3/t;

    invoke-direct {v0, p0}, Lzd3/t;-><init>(Lzt/h;)V

    invoke-direct {p1, v0}, Lzt/a0;-><init>(Lzd3/t;)V

    iput-object p1, p0, Lzt/h;->x:Landroid/os/Binder;

    :cond_1
    iget-object p1, p0, Lzt/h;->x:Landroid/os/Binder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lzt/h;->w:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    iget-object p2, p0, Lzt/h;->y:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iput p3, p0, Lzt/h;->z:I

    iget p3, p0, Lzt/h;->E:I

    add-int/lit8 p3, p3, 0x1

    iput p3, p0, Lzt/h;->E:I

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1}, Lzt/h;->c(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p2

    const/4 p3, 0x2

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Lzt/h;->b(Landroid/content/Intent;)V

    return p3

    :cond_0
    invoke-virtual {p0, p2}, Lzt/h;->e(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p2, 0x0

    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p2

    goto :goto_0

    :cond_1
    new-instance v0, Lcq/i;

    invoke-direct {v0}, Lcq/i;-><init>()V

    iget-object v1, p0, Lzt/h;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lh6/l;

    const/4 v3, 0x7

    invoke-direct {v2, p0, p2, v0, v3}, Lh6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object p2, v0, Lcq/i;->a:Lcq/u;

    :goto_0
    invoke-virtual {p2}, Lcq/u;->isComplete()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lzt/h;->b(Landroid/content/Intent;)V

    return p3

    :cond_2
    new-instance p3, Lm5/e;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Lm5/e;-><init>(I)V

    new-instance v0, Lqm2/c;

    const/16 v1, 0xb

    invoke-direct {v0, v1, p0, p1}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, p3, v0}, Lcq/u;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcq/d;)Lcom/google/android/gms/tasks/Task;

    const/4 p1, 0x3

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
