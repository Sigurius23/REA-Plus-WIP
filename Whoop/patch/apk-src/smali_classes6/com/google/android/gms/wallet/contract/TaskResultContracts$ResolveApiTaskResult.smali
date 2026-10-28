.class public abstract Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;
.super Lk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Lk/b;"
    }
.end annotation


# instance fields
.field public a:Lcom/google/android/gms/common/api/Status;

.field public b:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
.end method

.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 2

    check-cast p2, Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;->b:Landroid/app/PendingIntent;

    const-string p2, "pendingIntent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p1

    const-string p2, "pendingIntent.intentSender"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lj/l;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p2, p1, v0, v1, v1}, Lj/l;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    new-instance p1, Landroid/content/Intent;

    const-string v0, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final getSynchronousResult(Landroid/content/Context;Ljava/lang/Object;)Lk/a;
    .locals 1

    check-cast p2, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/common/api/ApiException;

    iget-object v0, v0, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iput-object v0, p0, Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;->a:Lcom/google/android/gms/common/api/Status;

    instance-of v0, p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    iget-object p1, p1, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget-object p1, p1, Lcom/google/android/gms/common/api/Status;->y:Landroid/app/PendingIntent;

    iput-object p1, p0, Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;->b:Landroid/app/PendingIntent;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;->b:Landroid/app/PendingIntent;

    if-nez p1, :cond_1

    new-instance p1, Lk/a;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$ResolveApiTaskResult;->a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p1, p2}, Lk/a;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The task has to be executed before using this API to resolve its result."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
