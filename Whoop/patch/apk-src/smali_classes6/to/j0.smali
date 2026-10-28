.class public final Lto/j0;
.super Lto/q;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le73/b;[Lcom/google/android/gms/common/c;ZI)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lto/j0;->d:I

    .line 1
    iput-object p1, p0, Lto/j0;->e:Ljava/lang/Object;

    invoke-direct {p0, p2, p3, p4}, Lto/q;-><init>([Lcom/google/android/gms/common/c;ZI)V

    return-void
.end method

.method public constructor <init>(Lyp/d;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lto/j0;->d:I

    .line 2
    iput-object p2, p0, Lto/j0;->e:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lto/q;-><init>()V

    return-void
.end method

.method public constructor <init>(Lyp/d;Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lto/j0;->d:I

    .line 3
    iput-object p2, p0, Lto/j0;->e:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lto/q;-><init>()V

    return-void
.end method

.method public constructor <init>(Lyp/d;Lpp/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lto/j0;->d:I

    .line 4
    iput-object p2, p0, Lto/j0;->e:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lto/q;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/api/d;Lcq/i;)V
    .locals 4

    iget v0, p0, Lto/j0;->d:I

    packed-switch v0, :pswitch_data_0

    move-object v0, p1

    check-cast v0, Lyp/e;

    iget-object p1, p0, Lto/j0;->e:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lyp/a;
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_0

    :try_start_1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    const-string v3, "com.google.android.gms.oss.licenses.IOSSLicenseService"

    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    const/4 p1, 0x5

    invoke-virtual {v1, v2, p1}, Lyp/a;->s(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    sget-object v1, Lpp/a;->a:Ljava/lang/ClassLoader;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    invoke-virtual {p2, v1}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_2
    new-instance p1, Landroid/os/RemoteException;

    const-string p2, "no service for getLicenseDetail call"

    invoke-direct {p1, p2}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :pswitch_0
    move-object v0, p1

    check-cast v0, Lyp/e;

    iget-object p1, p0, Lto/j0;->e:Ljava/lang/Object;

    check-cast p1, Lpp/d;

    monitor-enter v0

    :try_start_3
    invoke-virtual {v0}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lyp/a;
    :try_end_3
    .catch Landroid/os/DeadObjectException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catch_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_1

    :try_start_4
    iget-object p1, p1, Lpp/d;->w:Ljava/lang/String;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    const-string v3, "com.google.android.gms.oss.licenses.IOSSLicenseService"

    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x4

    invoke-virtual {v1, v2, p1}, Lyp/a;->s(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v0

    invoke-virtual {p2, v1}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_1
    :try_start_5
    new-instance p1, Landroid/os/RemoteException;

    const-string p2, "no service for getLicenseDetail call"

    invoke-direct {p1, p2}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1

    :pswitch_1
    move-object v0, p1

    check-cast v0, Lyp/e;

    iget-object p1, p0, Lto/j0;->e:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    monitor-enter v0

    :try_start_6
    invoke-virtual {v0}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lyp/a;
    :try_end_6
    .catch Landroid/os/DeadObjectException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_3

    :catch_2
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_2

    :try_start_7
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    const-string v3, "com.google.android.gms.oss.licenses.IOSSLicenseService"

    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-virtual {v1, v2, p1}, Lyp/a;->s(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    monitor-exit v0

    invoke-virtual {p2, v1}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_8
    new-instance p1, Landroid/os/RemoteException;

    const-string p2, "no service for getLicenseDetail call"

    invoke-direct {p1, p2}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw p1

    :pswitch_2
    iget-object v0, p0, Lto/j0;->e:Ljava/lang/Object;

    check-cast v0, Le73/b;

    iget-object v0, v0, Le73/b;->e:Ljava/lang/Object;

    check-cast v0, Lto/n;

    invoke-interface {v0, p1, p2}, Lto/n;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
