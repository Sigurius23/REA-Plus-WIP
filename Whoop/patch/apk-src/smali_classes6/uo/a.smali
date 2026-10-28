.class public abstract Luo/a;
.super Llp/g;
.source "SourceFile"

# interfaces
.implements Luo/i;


# direct methods
.method public static X(Landroid/os/IBinder;)Luo/i;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.common.internal.IAccountAccessor"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Luo/i;

    if-eqz v2, :cond_1

    check-cast v1, Luo/i;

    return-object v1

    :cond_1
    new-instance v1, Luo/i0;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v0, v2}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    return-object v1
.end method

.method public static c0(Luo/i;)Landroid/accounts/Account;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v1

    :try_start_0
    check-cast p0, Luo/i0;

    invoke-virtual {p0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {p0, v3, v4}, Lip/a;->c0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p0

    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p0, v3}, Llp/h;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/accounts/Account;

    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-object v3

    :catch_0
    :try_start_1
    const-string p0, "AccountAccessor"

    const-string v3, "Remote account accessor probably died"

    invoke-static {p0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    throw p0

    :cond_0
    return-object v0
.end method
