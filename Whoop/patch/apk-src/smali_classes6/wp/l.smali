.class public final Lwp/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lop/g;


# direct methods
.method public constructor <init>(Lop/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lwp/l;->a:Lop/g;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lwp/l;->a:Lop/g;

    new-instance v1, Lcp/b;

    invoke-direct {v1, p1}, Lcp/b;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lop/e;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1, v1}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v1, 0x1b

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

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lwp/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lwp/l;->a:Lop/g;

    check-cast p1, Lwp/l;

    iget-object p1, p1, Lwp/l;->a:Lop/g;

    check-cast v0, Lop/e;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v2

    invoke-static {v2, p1}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xf

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
    iget-object v0, p0, Lwp/l;->a:Lop/g;

    check-cast v0, Lop/e;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/16 v2, 0x10

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
