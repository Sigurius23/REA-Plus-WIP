.class public final Luo/z;
.super Llp/g;
.source "SourceFile"


# instance fields
.field public f:Luo/c;

.field public final g:I


# direct methods
.method public constructor <init>(Luo/c;I)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.IGmsCallbacks"

    invoke-direct {p0, v0}, Llp/g;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Luo/z;->f:Luo/c;

    iput p2, p0, Luo/z;->g:I

    return-void
.end method


# virtual methods
.method public final s(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 8

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v2, :cond_7

    const/4 v3, 0x2

    if-eq p1, v3, :cond_6

    const/4 v3, 0x3

    if-eq p1, v3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    sget-object v4, Luo/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v4}, Llp/h;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Luo/d0;

    invoke-static {p2}, Llp/h;->c(Landroid/os/Parcel;)V

    iget-object p2, p0, Luo/z;->f:Luo/c;

    const-string v5, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {p2, v5}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object v4, p2, Luo/c;->v:Luo/d0;

    invoke-virtual {p2}, Luo/c;->p()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, v4, Luo/d0;->z:Luo/f;

    invoke-static {}, Luo/k;->a()Luo/k;

    move-result-object v5

    if-nez p2, :cond_1

    move-object p2, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Luo/f;->b()Luo/l;

    move-result-object p2

    :goto_0
    monitor-enter v5

    if-nez p2, :cond_4

    :try_start_0
    sget-object p2, Luo/k;->c:Luo/l;

    :cond_2
    :goto_1
    iput-object p2, v5, Luo/k;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit v5

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    :try_start_1
    iget-object v6, v5, Luo/k;->a:Ljava/lang/Object;

    check-cast v6, Luo/l;

    if-eqz v6, :cond_2

    iget v6, v6, Luo/l;->w:I

    iget v7, p2, Luo/l;->w:I

    if-ge v6, v7, :cond_3

    goto :goto_1

    :goto_2
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_5
    :goto_3
    iget-object p2, v4, Luo/d0;->w:Landroid/os/Bundle;

    iget-object v4, p0, Luo/z;->f:Luo/c;

    const-string v5, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v4, v5}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Luo/z;->f:Luo/c;

    iget v5, p0, Luo/z;->g:I

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Luo/b0;

    invoke-direct {v6, v4, p1, v3, p2}, Luo/b0;-><init>(Luo/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    iget-object p1, v4, Luo/c;->e:Luo/y;

    invoke-virtual {p1, v2, v5, v0, v6}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    iput-object v1, p0, Luo/z;->f:Luo/c;

    goto :goto_4

    :cond_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Llp/h;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Llp/h;->c(Landroid/os/Parcel;)V

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_4

    :cond_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v4}, Llp/h;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    invoke-static {p2}, Llp/h;->c(Landroid/os/Parcel;)V

    iget-object p2, p0, Luo/z;->f:Luo/c;

    const-string v5, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {p2, v5}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Luo/z;->f:Luo/c;

    iget v5, p0, Luo/z;->g:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Luo/b0;

    invoke-direct {v6, p2, p1, v3, v4}, Luo/b0;-><init>(Luo/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    iget-object p1, p2, Luo/c;->e:Luo/y;

    invoke-virtual {p1, v2, v5, v0, v6}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    iput-object v1, p0, Luo/z;->f:Luo/c;

    :goto_4
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v2
.end method
