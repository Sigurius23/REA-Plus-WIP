.class public final Lup/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lvp/e;

.field public b:Lty/c;


# direct methods
.method public constructor <init>(Lvp/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lup/b;->a:Lvp/e;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lup/b;->a:Lvp/e;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/maps/model/CameraPosition;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v1}, Lop/h;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/CameraPosition;

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

.method public final b()Lty/c;
    .locals 6

    :try_start_0
    iget-object v0, p0, Lup/b;->b:Lty/c;

    if-nez v0, :cond_2

    new-instance v0, Lty/c;

    iget-object v1, p0, Lup/b;->a:Lvp/e;

    const-string v2, "com.google.android.gms.maps.internal.IUiSettingsDelegate"

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v3

    const/16 v4, 0x19

    invoke-virtual {v1, v3, v4}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v3, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v4

    instance-of v5, v4, Lvp/b;

    if-eqz v5, :cond_1

    move-object v2, v4

    check-cast v2, Lvp/b;

    goto :goto_0

    :cond_1
    new-instance v4, Lvp/b;

    const/4 v5, 0x3

    invoke-direct {v4, v3, v2, v5}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    move-object v2, v4

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    const/16 v1, 0x9

    invoke-direct {v0, v2, v1}, Lty/c;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lup/b;->b:Lty/c;

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v0, p0, Lup/b;->b:Lty/c;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_2
    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c(Lup/a;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lup/b;->a:Lvp/e;

    iget-object p1, p1, Lup/a;->a:Lcp/a;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    invoke-static {v1, p1}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x4

    invoke-virtual {v0, v1, p1}, Lip/a;->l0(Landroid/os/Parcel;I)V
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
    iget-object v0, p0, Lup/b;->a:Lvp/e;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/16 v2, 0x8

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
