.class public final Lcq/u;
.super Lcom/google/android/gms/tasks/Task;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lch3/h;

.field public c:Z

.field public volatile d:Z

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/tasks/Task;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    new-instance v0, Lch3/h;

    invoke-direct {v0}, Lch3/h;-><init>()V

    iput-object v0, p0, Lcq/u;->b:Lch3/h;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcq/u;->c:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcq/u;->c:Z

    iput-object p1, p0, Lcq/u;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    invoke-virtual {p1, p0}, Lch3/h;->b(Lcom/google/android/gms/tasks/Task;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-static {p0}, Lcom/google/android/gms/tasks/DuplicateTaskCompletionException;->a(Lcq/u;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final addOnCanceledListener(Landroid/app/Activity;Lcq/c;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    new-instance v0, Lcq/o;

    sget-object v1, Lcq/j;->a:Lcq/s;

    invoke-direct {v0, v1, p2}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/c;)V

    iget-object p2, p0, Lcq/u;->b:Lch3/h;

    .line 2
    invoke-virtual {p2, v0}, Lch3/h;->a(Lcq/p;)V

    .line 3
    invoke-static {p1}, Lcq/t;->j(Landroid/app/Activity;)Lcq/t;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcq/t;->k(Lcq/p;)V

    .line 4
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object p0
.end method

.method public final addOnCanceledListener(Lcq/c;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 5
    sget-object v0, Lcq/j;->a:Lcq/s;

    invoke-virtual {p0, v0, p1}, Lcq/u;->addOnCanceledListener(Ljava/util/concurrent/Executor;Lcq/c;)Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method

.method public final addOnCanceledListener(Ljava/util/concurrent/Executor;Lcq/c;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 6
    new-instance v0, Lcq/o;

    invoke-direct {v0, p1, p2}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/c;)V

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    invoke-virtual {p1, v0}, Lch3/h;->a(Lcq/p;)V

    .line 7
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object p0
.end method

.method public final addOnCompleteListener(Landroid/app/Activity;Lcq/d;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    new-instance v0, Lcq/o;

    sget-object v1, Lcq/j;->a:Lcq/s;

    invoke-direct {v0, v1, p2}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/d;)V

    iget-object p2, p0, Lcq/u;->b:Lch3/h;

    .line 2
    invoke-virtual {p2, v0}, Lch3/h;->a(Lcq/p;)V

    .line 3
    invoke-static {p1}, Lcq/t;->j(Landroid/app/Activity;)Lcq/t;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcq/t;->k(Lcq/p;)V

    .line 4
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object p0
.end method

.method public final addOnCompleteListener(Lcq/d;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 5
    sget-object v0, Lcq/j;->a:Lcq/s;

    new-instance v1, Lcq/o;

    invoke-direct {v1, v0, p1}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/d;)V

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    .line 6
    invoke-virtual {p1, v1}, Lch3/h;->a(Lcq/p;)V

    .line 7
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object p0
.end method

.method public final addOnCompleteListener(Ljava/util/concurrent/Executor;Lcq/d;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 8
    new-instance v0, Lcq/o;

    invoke-direct {v0, p1, p2}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/d;)V

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    invoke-virtual {p1, v0}, Lch3/h;->a(Lcq/p;)V

    .line 9
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object p0
.end method

.method public final addOnFailureListener(Landroid/app/Activity;Lcq/e;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    new-instance v0, Lcq/o;

    sget-object v1, Lcq/j;->a:Lcq/s;

    invoke-direct {v0, v1, p2}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/e;)V

    iget-object p2, p0, Lcq/u;->b:Lch3/h;

    .line 2
    invoke-virtual {p2, v0}, Lch3/h;->a(Lcq/p;)V

    .line 3
    invoke-static {p1}, Lcq/t;->j(Landroid/app/Activity;)Lcq/t;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcq/t;->k(Lcq/p;)V

    .line 4
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object p0
.end method

.method public final addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 5
    sget-object v0, Lcq/j;->a:Lcq/s;

    invoke-virtual {p0, v0, p1}, Lcq/u;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcq/e;)Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method

.method public final addOnFailureListener(Ljava/util/concurrent/Executor;Lcq/e;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 6
    new-instance v0, Lcq/o;

    invoke-direct {v0, p1, p2}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/e;)V

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    invoke-virtual {p1, v0}, Lch3/h;->a(Lcq/p;)V

    .line 7
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object p0
.end method

.method public final addOnSuccessListener(Landroid/app/Activity;Lcq/f;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    new-instance v0, Lcq/o;

    sget-object v1, Lcq/j;->a:Lcq/s;

    invoke-direct {v0, v1, p2}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/f;)V

    iget-object p2, p0, Lcq/u;->b:Lch3/h;

    .line 2
    invoke-virtual {p2, v0}, Lch3/h;->a(Lcq/p;)V

    .line 3
    invoke-static {p1}, Lcq/t;->j(Landroid/app/Activity;)Lcq/t;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcq/t;->k(Lcq/p;)V

    .line 4
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object p0
.end method

.method public final addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 5
    sget-object v0, Lcq/j;->a:Lcq/s;

    invoke-virtual {p0, v0, p1}, Lcq/u;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method

.method public final addOnSuccessListener(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 6
    new-instance v0, Lcq/o;

    invoke-direct {v0, p1, p2}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/f;)V

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    invoke-virtual {p1, v0}, Lch3/h;->a(Lcq/p;)V

    .line 7
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object p0
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcq/u;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcq/u;->c:Z

    iput-object p1, p0, Lcq/u;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    invoke-virtual {p1, p0}, Lch3/h;->b(Lcom/google/android/gms/tasks/Task;)V

    return v1

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcq/u;->c:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcq/u;->c:Z

    iput-object p1, p0, Lcq/u;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    invoke-virtual {p1, p0}, Lch3/h;->b(Lcom/google/android/gms/tasks/Task;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-static {p0}, Lcom/google/android/gms/tasks/DuplicateTaskCompletionException;->a(Lcq/u;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final continueWith(Lcq/b;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 1
    sget-object v0, Lcq/j;->a:Lcq/s;

    invoke-virtual {p0, v0, p1}, Lcq/u;->continueWith(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final continueWith(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 2
    new-instance v0, Lcq/u;

    invoke-direct {v0}, Lcq/u;-><init>()V

    new-instance v1, Lcq/n;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v0, v2}, Lcq/n;-><init>(Ljava/util/concurrent/Executor;Lcq/b;Lcq/u;I)V

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    .line 3
    invoke-virtual {p1, v1}, Lch3/h;->a(Lcq/p;)V

    .line 4
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object v0
.end method

.method public final continueWithTask(Lcq/b;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 1
    sget-object v0, Lcq/j;->a:Lcq/s;

    invoke-virtual {p0, v0, p1}, Lcq/u;->continueWithTask(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final continueWithTask(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 2
    new-instance v0, Lcq/u;

    invoke-direct {v0}, Lcq/u;-><init>()V

    new-instance v1, Lcq/n;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p2, v0, v2}, Lcq/n;-><init>(Ljava/util/concurrent/Executor;Lcq/b;Lcq/u;I)V

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    .line 3
    invoke-virtual {p1, v1}, Lch3/h;->a(Lcq/p;)V

    .line 4
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcq/u;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcq/u;->c:Z

    iput-boolean v1, p0, Lcq/u;->d:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcq/u;->b:Lch3/h;

    invoke-virtual {v0, p0}, Lch3/h;->b(Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcq/u;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcq/u;->b:Lch3/h;

    invoke-virtual {v0, p0}, Lch3/h;->b(Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final getException()Ljava/lang/Exception;
    .locals 2

    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcq/u;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getResult()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lcq/u;->c:Z

    const-string v2, "Task is not yet complete"

    invoke-static {v2, v1}, Luo/w;->h(Ljava/lang/String;Z)V

    .line 3
    iget-boolean v1, p0, Lcq/u;->d:Z

    if-nez v1, :cond_1

    .line 4
    iget-object v1, p0, Lcq/u;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Lcq/u;->e:Ljava/lang/Object;

    .line 6
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    .line 7
    :cond_0
    new-instance v2, Lcom/google/android/gms/tasks/RuntimeExecutionException;

    .line 8
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 9
    throw v2

    .line 10
    :cond_1
    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Task is already canceled."

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 11
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getResult(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    .line 12
    const-class p1, Ljava/io/IOException;

    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 13
    :try_start_0
    iget-boolean v1, p0, Lcq/u;->c:Z

    const-string v2, "Task is not yet complete"

    invoke-static {v2, v1}, Luo/w;->h(Ljava/lang/String;Z)V

    .line 14
    iget-boolean v1, p0, Lcq/u;->d:Z

    if-nez v1, :cond_2

    .line 15
    iget-object v1, p0, Lcq/u;->f:Ljava/lang/Exception;

    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 17
    iget-object p1, p0, Lcq/u;->f:Ljava/lang/Exception;

    if-nez p1, :cond_0

    .line 18
    iget-object p1, p0, Lcq/u;->e:Ljava/lang/Object;

    .line 19
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Lcom/google/android/gms/tasks/RuntimeExecutionException;

    .line 21
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    throw v1

    .line 23
    :cond_1
    iget-object v1, p0, Lcq/u;->f:Ljava/lang/Exception;

    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 25
    :cond_2
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task is already canceled."

    invoke-direct {p1, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final isCanceled()Z
    .locals 1

    iget-boolean v0, p0, Lcq/u;->d:Z

    return v0
.end method

.method public final isComplete()Z
    .locals 2

    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcq/u;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final isSuccessful()Z
    .locals 3

    iget-object v0, p0, Lcq/u;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcq/u;->c:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcq/u;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcq/u;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return v2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final onSuccessTask(Lcq/h;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    sget-object v0, Lcq/j;->a:Lcq/s;

    new-instance v1, Lcq/u;

    .line 2
    invoke-direct {v1}, Lcq/u;-><init>()V

    new-instance v2, Lcq/o;

    invoke-direct {v2, v0, p1, v1}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/h;Lcq/u;)V

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    .line 3
    invoke-virtual {p1, v2}, Lch3/h;->a(Lcq/p;)V

    .line 4
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object v1
.end method

.method public final onSuccessTask(Ljava/util/concurrent/Executor;Lcq/h;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 5
    new-instance v0, Lcq/u;

    invoke-direct {v0}, Lcq/u;-><init>()V

    new-instance v1, Lcq/o;

    invoke-direct {v1, p1, p2, v0}, Lcq/o;-><init>(Ljava/util/concurrent/Executor;Lcq/h;Lcq/u;)V

    iget-object p1, p0, Lcq/u;->b:Lch3/h;

    .line 6
    invoke-virtual {p1, v1}, Lch3/h;->a(Lcq/p;)V

    .line 7
    invoke-virtual {p0}, Lcq/u;->e()V

    return-object v0
.end method
