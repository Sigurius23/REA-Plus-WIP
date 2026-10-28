.class public final Lto/k0;
.super Lto/n0;
.source "SourceFile"


# instance fields
.field public final b:Lto/d;


# direct methods
.method public constructor <init>(ILto/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lto/n0;-><init>(I)V

    const-string p1, "Null methods are not runnable."

    invoke-static {p2, p1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lto/k0;->b:Lto/d;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lto/k0;->b:Lto/d;

    invoke-virtual {v0, p1}, Lto/d;->d0(Lcom/google/android/gms/common/api/Status;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "ApiCallRunner"

    const-string v1, "Exception reporting failure"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 5

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v3

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, ": "

    invoke-static {v4, v1, v2, p1}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-direct {v0, v2, p1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    :try_start_0
    iget-object p1, p0, Lto/k0;->b:Lto/d;

    invoke-virtual {p1, v0}, Lto/d;->d0(Lcom/google/android/gms/common/api/Status;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "ApiCallRunner"

    const-string v1, "Exception reporting failure"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final c(Lpg3/o;Z)V
    .locals 2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iget-object v0, p1, Lpg3/o;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lto/k0;->b:Lto/d;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lto/s0;

    invoke-direct {p2, p1, v1}, Lto/s0;-><init>(Lpg3/o;Lcom/google/android/gms/common/api/internal/BasePendingResult;)V

    invoke-virtual {v1, p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->W(Lto/s0;)V

    return-void
.end method

.method public final d(Lto/v;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lto/k0;->b:Lto/d;

    iget-object p1, p1, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v1, 0x0

    const/16 v2, 0x8

    :try_start_1
    invoke-virtual {v0, p1}, Lto/d;->c0(Lcom/google/android/gms/common/api/d;)V
    :try_end_1
    .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    return-void

    :catch_0
    move-exception p1

    :try_start_2
    new-instance v3, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v2, p1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-virtual {v0, v3}, Lto/d;->d0(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catch_1
    move-exception p1

    new-instance v3, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-virtual {v0, v3}, Lto/d;->d0(Lcom/google/android/gms/common/api/Status;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception p1

    invoke-virtual {p0, p1}, Lto/k0;->b(Ljava/lang/Exception;)V

    return-void
.end method
