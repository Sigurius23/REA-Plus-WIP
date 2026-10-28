.class public final Lnp/i;
.super Luo/h;
.source "SourceFile"


# instance fields
.field public final A:Lcd3/g;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;Ljava/lang/String;Lcom/google/crypto/tink/internal/k0;)V
    .locals 8

    const/16 v3, 0x17

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move-object v6, p4

    move-object v4, p6

    invoke-direct/range {v0 .. v7}, Luo/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;I)V

    new-instance p1, Laj/c;

    const/16 p2, 0x15

    invoke-direct {p1, p0, p2}, Laj/c;-><init>(Ljava/lang/Object;I)V

    iput-object p5, v0, Lnp/i;->z:Ljava/lang/String;

    new-instance p2, Lcd3/g;

    invoke-direct {p2, v1, p1}, Lcd3/g;-><init>(Landroid/content/Context;Laj/c;)V

    iput-object p2, v0, Lnp/i;->A:Lcd3/g;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    const v0, 0xb2c988

    return v0
.end method

.method public final d(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lnp/e;

    if-eqz v2, :cond_1

    check-cast v1, Lnp/e;

    return-object v1

    :cond_1
    new-instance v1, Lnp/e;

    invoke-direct {v1, p1, v0}, Lnp/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-object v1
.end method

.method public final e()V
    .locals 6

    iget-object v0, p0, Lnp/i;->A:Lcd3/g;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Luo/c;->n()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    iget-object v1, p0, Lnp/i;->A:Lcd3/g;

    invoke-virtual {v1}, Lcd3/g;->M()V

    iget-object v1, p0, Lnp/i;->A:Lcd3/g;

    iget-boolean v2, v1, Lcd3/g;->w:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v2, Laj/c;

    iget-object v3, v2, Laj/c;->x:Ljava/lang/Object;

    check-cast v3, Lnp/i;

    invoke-virtual {v3}, Luo/c;->c()V

    invoke-virtual {v2}, Laj/c;->a0()Lnp/e;

    move-result-object v2

    invoke-virtual {v2}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lnp/l;->a(Landroid/os/Parcel;Z)V

    const/16 v5, 0xc

    invoke-virtual {v2, v3, v5}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    iput-boolean v4, v1, Lcd3/g;->w:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "LocationClientImpl"

    const-string v3, "Client disconnected before listeners could be cleaned up"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    invoke-super {p0}, Luo/c;->e()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final g()[Lcom/google/android/gms/common/c;
    .locals 1

    sget-object v0, Ltp/h;->e:[Lcom/google/android/gms/common/c;

    return-object v0
.end method

.method public final h()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "client_name"

    iget-object v2, p0, Lnp/i;->z:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final u(Lto/j;Ltp/s;)V
    .locals 3

    iget-object v0, p0, Lnp/i;->A:Lcd3/g;

    iget-object v1, v0, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v1, Laj/c;

    iget-object v1, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lnp/i;

    invoke-virtual {v1}, Luo/c;->c()V

    const-string v1, "Invalid null listener key"

    invoke-static {p1, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Lcd3/g;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnp/f;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lnp/f;->i0()V

    iget-object v0, v0, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v0, Laj/c;

    invoke-virtual {v0}, Laj/c;->a0()Lnp/e;

    move-result-object v0

    invoke-static {p1, p2}, Lnp/k;->f(Lnp/f;Ltp/s;)Lnp/k;

    move-result-object p1

    invoke-virtual {v0, p1}, Lnp/e;->j0(Lnp/k;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
