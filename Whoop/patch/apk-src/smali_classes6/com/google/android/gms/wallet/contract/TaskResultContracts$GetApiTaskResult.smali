.class public abstract Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;
.super Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult<",
        "TT;",
        "Lfq/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lfq/a;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/google/android/gms/common/api/Status;->E:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p1, v1}, Lfq/a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    new-instance p1, Lfq/a;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x10

    const-string v3, "The task has been canceled."

    invoke-direct {v1, v2, v3, v0, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-direct {p1, v0, v1}, Lfq/a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;->a:Lcom/google/android/gms/common/api/Status;

    if-eqz p1, :cond_2

    new-instance v1, Lfq/a;

    invoke-direct {v1, v0, p1}, Lfq/a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object v1

    :cond_2
    new-instance p1, Lfq/a;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->G:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0, v1}, Lfq/a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p1
.end method

.method public b(ILandroid/content/Intent;)Lfq/a;
    .locals 3

    const/4 v0, -0x1

    sget-object v1, Lcom/google/android/gms/common/api/Status;->G:Lcom/google/android/gms/common/api/Status;

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_0

    new-instance p1, Lfq/a;

    invoke-direct {p1, v2, v1}, Lfq/a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p1

    :cond_0
    new-instance p1, Lfq/a;

    sget-object p2, Lcom/google/android/gms/common/api/Status;->I:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v2, p2}, Lfq/a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p1

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p0, p2}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;->c(Landroid/content/Intent;)Ldq/l;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_3

    new-instance p2, Lfq/a;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->E:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p2, p1, v0}, Lfq/a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p2

    :cond_3
    new-instance p1, Lfq/a;

    invoke-direct {p1, v2, v1}, Lfq/a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object p1
.end method

.method public abstract c(Landroid/content/Intent;)Ldq/l;
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;->b(ILandroid/content/Intent;)Lfq/a;

    move-result-object p1

    return-object p1
.end method
