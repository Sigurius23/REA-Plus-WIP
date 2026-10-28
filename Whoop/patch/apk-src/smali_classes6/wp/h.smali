.class public Lwp/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lop/c;


# direct methods
.method public constructor <init>(Lop/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lwp/h;->a:Lop/c;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/maps/model/LatLng;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lwp/h;->a:Lop/c;

    check-cast v0, Lop/a;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v1}, Lop/h;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final b()Z
    .locals 3

    :try_start_0
    iget-object v0, p0, Lwp/h;->a:Lop/c;

    check-cast v0, Lop/a;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v0, v1, v2}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lwp/h;->a:Lop/c;

    new-instance v1, Lcp/b;

    invoke-direct {v1, p1}, Lcp/b;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lop/a;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1, v1}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v1, 0x1d

    invoke-virtual {v0, p1, v1}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final d()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lwp/h;->a:Lop/c;

    check-cast v0, Lop/a;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lwp/h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lwp/h;->a:Lop/c;

    check-cast p1, Lwp/h;

    iget-object p1, p1, Lwp/h;->a:Lop/c;

    check-cast v0, Lop/a;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v2

    invoke-static {v2, p1}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x10

    invoke-virtual {v0, v2, p1}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lwp/h;->a:Lop/c;

    check-cast v0, Lop/a;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
