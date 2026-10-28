.class public final Lsr/d;
.super Lsr/g;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lsr/h;

.field public final synthetic y:J

.field public final synthetic z:Lcq/i;


# direct methods
.method public constructor <init>(Lsr/h;Lcq/i;JLcq/i;)V
    .locals 0

    iput-wide p3, p0, Lsr/d;->y:J

    iput-object p5, p0, Lsr/d;->z:Lcq/i;

    iput-object p1, p0, Lsr/d;->E:Lsr/h;

    invoke-direct {p0, p1, p2}, Lsr/g;-><init>(Lsr/h;Lcq/i;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 11

    iget-object v0, p0, Lsr/d;->z:Lcq/i;

    iget-wide v1, p0, Lsr/d;->y:J

    iget-object v3, p0, Lsr/d;->E:Lsr/h;

    invoke-static {v3}, Lsr/h;->d(Lsr/h;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    new-instance v0, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v5}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    invoke-virtual {p0, v0}, Lsr/g;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-static {v3}, Lsr/h;->c(Lsr/h;)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v0, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    const/16 v1, -0xe

    invoke-direct {v0, v1, v5}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    invoke-virtual {p0, v0}, Lsr/g;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v4, v3, Lsr/h;->e:Lxr/b;

    iget-object v4, v4, Lxr/b;->n:Lxr/r;

    invoke-static {v3, v1, v2}, Lsr/h;->b(Lsr/h;J)Landroid/os/Bundle;

    move-result-object v6

    new-instance v7, Lsr/f;

    const/4 v8, 0x1

    invoke-direct {v7, v3, v0, v8}, Lsr/f;-><init>(Lsr/h;Lcq/i;I)V

    check-cast v4, Lxr/p;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v9

    const-string v10, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    invoke-virtual {v9, v10}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    sget v10, Lxr/n;->a:I

    invoke-virtual {v9, v8}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v10, 0x0

    invoke-virtual {v6, v9, v10}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v9, v7}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v4, v4, Lxr/p;->f:Landroid/os/IBinder;

    const/4 v6, 0x2

    invoke-interface {v4, v6, v9, v5, v8}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v9}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception v4

    invoke-virtual {v9}, Landroid/os/Parcel;->recycle()V

    throw v4
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v4

    iget-object v3, v3, Lsr/h;->a:Lxr/t;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "warmUpIntegrityToken(%s)"

    invoke-virtual {v3, v4, v2, v1}, Lxr/t;->a(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    const/16 v2, -0x64

    invoke-direct {v1, v2, v4}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    invoke-virtual {v0, v1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void
.end method
