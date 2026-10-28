.class public final Luo/b0;
.super Luo/u;
.source "SourceFile"


# instance fields
.field public final g:Landroid/os/IBinder;

.field public final synthetic h:Luo/c;


# direct methods
.method public constructor <init>(Luo/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Luo/b0;->h:Luo/c;

    invoke-direct {p0, p1, p2, p4}, Luo/u;-><init>(Luo/c;ILandroid/os/Bundle;)V

    iput-object p3, p0, Luo/b0;->g:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 7

    const-string v0, "GmsClient"

    iget-object v1, p0, Luo/b0;->g:Landroid/os/IBinder;

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, Luo/w;->f(Ljava/lang/Object;)V

    move-object v3, v1

    check-cast v3, Landroid/os/IBinder;

    invoke-interface {v3}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v4, p0, Luo/b0;->h:Luo/c;

    invoke-virtual {v4}, Luo/c;->k()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v4}, Luo/c;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v4, v4, 0x22

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    add-int/2addr v4, v5

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "service descriptor mismatch: "

    const-string v5, " vs. "

    invoke-static {v6, v4, v1, v5, v3}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_0
    invoke-virtual {v4, v1}, Luo/c;->d(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v1, 0x2

    const/4 v3, 0x4

    invoke-virtual {v4, v1, v3, v0}, Luo/c;->q(IILandroid/os/IInterface;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x3

    invoke-virtual {v4, v1, v3, v0}, Luo/c;->q(IILandroid/os/IInterface;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const/4 v0, 0x0

    iput-object v0, v4, Luo/c;->t:Lcom/google/android/gms/common/a;

    iget-object v0, v4, Luo/c;->n:Luo/k;

    if-eqz v0, :cond_2

    iget-object v0, v0, Luo/k;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/i;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/i;->s()V

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    return v2

    :catch_0
    const-string v1, "service probably died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2
.end method

.method public final b(Lcom/google/android/gms/common/a;)V
    .locals 1

    iget-object v0, p0, Luo/b0;->h:Luo/c;

    iget-object v0, v0, Luo/c;->o:Luo/k;

    if-eqz v0, :cond_0

    iget-object v0, v0, Luo/k;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/j;->c0(Lcom/google/android/gms/common/a;)V

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void
.end method
