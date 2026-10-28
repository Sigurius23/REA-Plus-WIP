.class public abstract Lic/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mAppContext:Landroid/content/Context;

.field private final mStopReason:Ljava/util/concurrent/atomic/AtomicInteger;

.field private mUsed:Z

.field private mWorkerParams:Landroidx/work/WorkerParameters;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 v1, -0x100

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lic/v;->mStopReason:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lic/v;->mAppContext:Landroid/content/Context;

    iput-object p2, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    return-void
.end method


# virtual methods
.method public final getApplicationContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lic/v;->mAppContext:Landroid/content/Context;

    return-object v0
.end method

.method public getBackgroundExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->f:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public abstract getForegroundInfoAsync()Lds/v;
.end method

.method public final getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public final getInputData()Lic/g;
    .locals 1

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Lic/g;

    return-object v0
.end method

.method public final getNetwork()Landroid/net/Network;
    .locals 1

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->d:La3/p;

    iget-object v0, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Landroid/net/Network;

    return-object v0
.end method

.method public final getRunAttemptCount()I
    .locals 1

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget v0, v0, Landroidx/work/WorkerParameters;->e:I

    return v0
.end method

.method public final getStopReason()I
    .locals 1

    iget-object v0, p0, Lic/v;->mStopReason:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final getTags()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->c:Ljava/util/HashSet;

    return-object v0
.end method

.method public getTaskExecutor()Lsc/a;
    .locals 1

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->h:Lsc/b;

    return-object v0
.end method

.method public final getTriggeredContentAuthorities()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->d:La3/p;

    iget-object v0, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getTriggeredContentUris()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->d:La3/p;

    iget-object v0, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getWorkerFactory()Lic/t0;
    .locals 1

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->i:Lic/i;

    return-object v0
.end method

.method public final isStopped()Z
    .locals 2

    iget-object v0, p0, Lic/v;->mStopReason:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/16 v1, -0x100

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isUsed()Z
    .locals 1

    iget-boolean v0, p0, Lic/v;->mUsed:Z

    return v0
.end method

.method public onStopped()V
    .locals 0

    return-void
.end method

.method public final setForegroundAsync(Lic/m;)Lds/v;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic/m;",
            ")",
            "Lds/v;"
        }
    .end annotation

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v2, v0, Landroidx/work/WorkerParameters;->k:Lrc/m;

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {p0}, Lic/v;->getId()Ljava/util/UUID;

    move-result-object v3

    iget-object v0, v2, Lrc/m;->a:Lsc/b;

    iget-object v0, v0, Lsc/b;->a:Landroidx/room/u1;

    new-instance v1, Lnw0/e;

    const/16 v6, 0xa

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Lnw0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string p1, "setForegroundAsync"

    invoke-static {v0, p1, v1}, Lq83/g;->t(Landroidx/room/u1;Ljava/lang/String;Lc93/a;)Ld4/l;

    move-result-object p1

    return-object p1
.end method

.method public setProgressAsync(Lic/g;)Lds/v;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic/g;",
            ")",
            "Lds/v;"
        }
    .end annotation

    iget-object v0, p0, Lic/v;->mWorkerParams:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->j:Lrc/n;

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    invoke-virtual {p0}, Lic/v;->getId()Ljava/util/UUID;

    move-result-object v1

    iget-object v2, v0, Lrc/n;->b:Lsc/b;

    iget-object v2, v2, Lsc/b;->a:Landroidx/room/u1;

    new-instance v3, Ln0/j;

    const/16 v4, 0x1c

    invoke-direct {v3, v0, v1, p1, v4}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string p1, "updateProgress"

    invoke-static {v2, p1, v3}, Lq83/g;->t(Landroidx/room/u1;Ljava/lang/String;Lc93/a;)Ld4/l;

    move-result-object p1

    return-object p1
.end method

.method public final setUsed()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lic/v;->mUsed:Z

    return-void
.end method

.method public abstract startWork()Lds/v;
.end method

.method public final stop(I)V
    .locals 2

    iget-object v0, p0, Lic/v;->mStopReason:Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 v1, -0x100

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lic/v;->onStopped()V

    :cond_0
    return-void
.end method
