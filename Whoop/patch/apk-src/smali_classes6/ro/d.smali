.class public final Lro/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Lo8/c;

.field public final c:Landroid/content/Context;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/concurrent/Executor;

.field public volatile i:Lp8/a;

.field public volatile j:Lp8/a;

.field public final synthetic k:I

.field public l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 4
    sget-object v0, Lp8/a;->H:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lro/d;->d:Z

    .line 7
    iput-boolean v1, p0, Lro/d;->e:Z

    const/4 v2, 0x1

    .line 8
    iput-boolean v2, p0, Lro/d;->f:Z

    .line 9
    iput-boolean v1, p0, Lro/d;->g:Z

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lro/d;->c:Landroid/content/Context;

    .line 11
    iput-object v0, p0, Lro/d;->h:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lro/d;->k:I

    .line 1
    invoke-direct {p0, p1}, Lro/d;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Ljava/util/concurrent/Semaphore;

    invoke-direct {p1, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object p1, p0, Lro/d;->l:Ljava/lang/Object;

    iput-object p2, p0, Lro/d;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lt9/u;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lro/d;->k:I

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lro/d;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lro/d;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lro/d;->i:Lp8/a;

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lro/d;->d:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lro/d;->g:Z

    :cond_0
    iget-object v0, p0, Lro/d;->j:Lp8/a;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lro/d;->i:Lp8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v2, p0, Lro/d;->i:Lp8/a;

    return-void

    :cond_1
    iget-object v0, p0, Lro/d;->i:Lp8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lro/d;->i:Lp8/a;

    iget-object v3, v0, Lp8/a;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, v0, Lp8/a;->x:Lp8/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lro/d;->i:Lp8/a;

    iput-object v0, p0, Lro/d;->j:Lp8/a;

    :cond_2
    iput-object v2, p0, Lro/d;->i:Lp8/a;

    :cond_3
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lro/d;->b:Lo8/c;

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, Lro/d;->j:Lp8/a;

    if-nez v0, :cond_3

    iget-object v0, p0, Lro/d;->i:Lp8/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lro/d;->i:Lp8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lro/d;->i:Lp8/a;

    iget-object v1, p0, Lro/d;->h:Ljava/util/concurrent/Executor;

    iget v2, v0, Lp8/a;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_2

    iget v0, v0, Lp8/a;->y:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We should never reach this state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task is already running."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iput v3, v0, Lp8/a;->y:I

    iget-object v2, v0, Lp8/a;->w:Lio/seon/androidsdk/service/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lp8/a;->x:Lp8/c;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lro/d;->k:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lro/d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "third_party_license_metadata"

    const-wide/16 v2, 0x0

    const/4 v4, -0x1

    invoke-static {v0, v1, v2, v3, v4}, Lo73/a;->b0(Landroid/content/Context;Ljava/lang/String;JI)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v5, v3

    :goto_0
    if-ge v5, v2, :cond_4

    aget-object v6, v0, v5

    const/16 v7, 0x20

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    invoke-virtual {v6, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    const-string v9, ":"

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-ne v9, v10, :cond_0

    if-lez v7, :cond_0

    aget-object v9, v8, v3

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    aget-object v8, v8, v11

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lpp/d;

    invoke-direct {v7, v8, v6, v9, v10}, Lpp/d;-><init>(ILjava/lang/String;J)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v5, 0x32

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    move v5, v3

    move v6, v5

    :goto_1
    const-string v7, "Invalid license meta-data line:\n%s"

    if-gtz v5, :cond_2

    const-string v8, "%s"

    invoke-virtual {v7, v8, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v8

    if-ne v8, v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v2, v7, v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    aget-object v5, v1, v3

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v8, 0x2

    move v5, v11

    goto :goto_1

    :cond_2
    :goto_2
    const/16 v4, 0x22

    invoke-virtual {v2, v7, v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    if-gtz v5, :cond_3

    const-string v4, " ["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v1, v1, v3

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    iget-object v0, p0, Lro/d;->m:Ljava/lang/Object;

    check-cast v0, Lt9/u;

    iget-object v0, v0, Lt9/u;->w:Ljava/lang/Object;

    check-cast v0, Lyp/d;

    new-instance v2, Lto/j0;

    invoke-direct {v2, v0, v1}, Lto/j0;-><init>(Lyp/d;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "Task must not be null"

    invoke-static {v0, v3}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "TimeUnit must not be null"

    invoke-static {v2, v3}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcq/l;

    invoke-direct {v3}, Lcq/l;-><init>()V

    new-instance v4, Lcq/i;

    invoke-direct {v4, v3}, Lcq/i;-><init>(Lcq/a;)V

    new-instance v5, Ljp/d;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    const/4 v7, 0x3

    invoke-direct {v5, v6, v7}, Ljp/d;-><init>(Landroid/os/Looper;I)V

    new-instance v6, Lcq/k;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v4}, Lcq/k;-><init>(ILcq/i;)V

    const-wide/16 v7, 0x2

    invoke-virtual {v2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    invoke-virtual {v5, v6, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v2, La33/d;

    const/16 v6, 0xb

    invoke-direct {v2, v5, v4, v3, v6}, La33/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcq/d;)Lcom/google/android/gms/tasks/Task;

    iget-object v0, v4, Lcq/i;->a:Lcq/u;

    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcq/u;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Lcq/u;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "OssLicensesLoader"

    const-string v3, "Error getting license list from service: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_4
    return-object v1

    :pswitch_0
    iget-object v0, p0, Lro/d;->m:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_6

    :try_start_1
    iget-object v0, p0, Lro/d;->l:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Semaphore;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v2, 0x0

    const-wide/16 v3, 0x5

    invoke-virtual {v0, v2, v3, v4, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(IJLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_5

    :catch_2
    move-exception v0

    const-string v1, "GACSignInLoader"

    const-string v2, "Unexpected InterruptedException"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_5
    const/4 v0, 0x0

    return-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {v0, p0}, Ltx/f;->y(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    const-string v1, " id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lro/d;->a:I

    const-string v2, "}"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
