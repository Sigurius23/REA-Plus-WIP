.class public final Lsr/e;
.super Lsr/g;
.source "SourceFile"


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lcq/i;

.field public final synthetic G:Lsr/h;

.field public final synthetic y:Lsr/o;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(Lsr/h;Lcq/i;Lsr/o;JJLcq/i;)V
    .locals 0

    iput-object p3, p0, Lsr/e;->y:Lsr/o;

    iput-wide p4, p0, Lsr/e;->z:J

    iput-wide p6, p0, Lsr/e;->E:J

    iput-object p8, p0, Lsr/e;->F:Lcq/i;

    iput-object p1, p0, Lsr/e;->G:Lsr/h;

    invoke-direct {p0, p1, p2}, Lsr/g;-><init>(Lsr/h;Lcq/i;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 10

    iget-object v2, p0, Lsr/e;->y:Lsr/o;

    iget-object v7, p0, Lsr/e;->F:Lcq/i;

    iget-object v1, p0, Lsr/e;->G:Lsr/h;

    invoke-static {v1}, Lsr/h;->d(Lsr/h;)Z

    move-result v0

    const/4 v8, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v8}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    invoke-virtual {p0, v0}, Lsr/g;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-static {v1}, Lsr/h;->c(Lsr/h;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    const/16 v1, -0xe

    invoke-direct {v0, v1, v8}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    invoke-virtual {p0, v0}, Lsr/g;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v0, v1, Lsr/h;->e:Lxr/b;

    iget-object v0, v0, Lxr/b;->n:Lxr/r;

    iget-wide v3, p0, Lsr/e;->z:J

    iget-wide v5, p0, Lsr/e;->E:J

    invoke-static/range {v1 .. v6}, Lsr/h;->a(Lsr/h;Lsr/o;JJ)Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, Lsr/f;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v7, v5}, Lsr/f;-><init>(Lsr/h;Lcq/i;I)V

    check-cast v0, Lxr/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v6

    const-string v9, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    invoke-virtual {v6, v9}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    sget v9, Lxr/n;->a:I

    const/4 v9, 0x1

    invoke-virtual {v6, v9}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v3, v6, v5}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v6, v4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v0, Lxr/p;->f:Landroid/os/IBinder;

    const/4 v3, 0x3

    invoke-interface {v0, v3, v6, v8, v9}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    throw v0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    iget-object v1, v1, Lsr/h;->a:Lxr/t;

    iget-object v3, v2, Lsr/o;->a:Ljava/lang/String;

    iget-object v2, v2, Lsr/o;->b:Ljava/util/Set;

    iget-wide v4, p0, Lsr/e;->z:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v3, v2, v4}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "requestExpressIntegrityToken(%s, %s, %s)"

    invoke-virtual {v1, v0, v3, v2}, Lxr/t;->a(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    const/16 v2, -0x64

    invoke-direct {v1, v2, v0}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    invoke-virtual {v7, v1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void
.end method
