.class public final Leu/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leu/x;


# instance fields
.field public final a:Lup/b;

.field public b:Leu/w;

.field public c:Ly3/c;

.field public d:Ly3/m;

.field public e:Leu/g;


# direct methods
.method public constructor <init>(Lup/b;Leu/g;Leu/w;Ly3/c;Ly3/m;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraPositionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clickListeners"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutDirection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu/b0;->a:Lup/b;

    iput-object p3, p0, Leu/b0;->b:Leu/w;

    iput-object p4, p0, Leu/b0;->c:Ly3/c;

    iput-object p5, p0, Leu/b0;->d:Ly3/m;

    invoke-virtual {p2, p1}, Leu/g;->c(Lup/b;)V

    iput-object p2, p0, Leu/b0;->e:Leu/g;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    iget-object v1, p0, Leu/b0;->a:Lup/b;

    iget-object v2, v1, Lup/b;->a:Lvp/e;

    iget-object v1, v1, Lup/b;->a:Lvp/e;

    :try_start_0
    new-instance v3, Lup/e;

    invoke-direct {v3, v0}, Lup/e;-><init>(Leu/a0;)V

    invoke-virtual {v2}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v3}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v3, 0x63

    invoke-virtual {v2, v0, v3}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_a

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    :try_start_1
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v4}, Lup/e;-><init>(Leu/a0;BI)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x62

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_9

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    :try_start_2
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3, v3}, Lup/e;-><init>(Leu/a0;BB)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x60

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_8

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    :try_start_3
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v4}, Lup/e;-><init>(Leu/a0;BC)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x61

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_7

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    :try_start_4
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v4}, Lup/e;-><init>(Leu/a0;BS)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x1c

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_6

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    :try_start_5
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lup/e;-><init>(Leu/a0;B)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x1d

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_5

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    :try_start_6
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lup/e;-><init>(Leu/a0;S)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x2a

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_4

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    :try_start_7
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lup/e;-><init>(Leu/a0;C)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x25

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_3

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    :try_start_8
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lup/e;-><init>(Leu/a0;I)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x6b

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_2

    new-instance v0, Leu/a0;

    invoke-direct {v0, p0}, Leu/a0;-><init>(Leu/b0;)V

    :try_start_9
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v4}, Lup/e;-><init>(Leu/a0;BZ)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x50

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_1

    new-instance v0, Le10/k0;

    const/16 v2, 0x8

    invoke-direct {v0, p0, v2}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    :try_start_a
    new-instance v2, Lup/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lup/e;-><init>(Le10/k0;B)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v2, 0x2d

    invoke-virtual {v1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_4
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_5
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_6
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_7
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_8
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_9
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_a
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Leu/b0;->e:Leu/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leu/g;->c(Lup/b;)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Leu/b0;->e:Leu/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leu/g;->c(Lup/b;)V

    return-void
.end method
