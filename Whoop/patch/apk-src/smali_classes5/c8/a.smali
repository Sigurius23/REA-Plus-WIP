.class public final Lc8/a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    iput-object p1, p0, Lc8/a;->f:Landroid/content/Context;

    iput-object p2, p0, Lc8/a;->g:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    const-string v0, "androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 v0, 0x0

    if-eq p1, v1, :cond_8

    const/4 v2, 0x2

    if-eq p1, v2, :cond_5

    const/4 v2, 0x3

    if-eq p1, v2, :cond_2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    const-string p3, "androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback"

    invoke-interface {p2, p3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p3

    if-eqz p3, :cond_4

    instance-of p4, p3, Lc8/b;

    if-eqz p4, :cond_4

    move-object v0, p3

    check-cast v0, Lc8/b;

    goto :goto_0

    :cond_4
    new-instance v0, Lc8/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p2, v0, Lc8/b;->f:Landroid/os/IBinder;

    :goto_0
    invoke-virtual {p0, p1}, Lc8/a;->s(Ljava/lang/String;)V

    new-instance p1, Landroidx/fragment/app/m;

    const/16 p2, 0xa

    invoke-direct {p1, v0, p2}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    iget-object p2, p0, Lc8/a;->g:Ljava/util/concurrent/Executor;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v1

    :cond_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_6

    goto :goto_1

    :cond_6
    const-string p3, "androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback"

    invoke-interface {p2, p3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p3

    if-eqz p3, :cond_7

    instance-of p4, p3, Lc8/c;

    if-eqz p4, :cond_7

    move-object v0, p3

    check-cast v0, Lc8/c;

    goto :goto_1

    :cond_7
    new-instance v0, Lc8/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p2, v0, Lc8/c;->f:Landroid/os/IBinder;

    :goto_1
    invoke-virtual {p0, p1}, Lc8/a;->s(Ljava/lang/String;)V

    new-instance p1, La8/c;

    const/4 p2, 0x4

    invoke-direct {p1, p2, p0, v0}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lc8/a;->g:Ljava/util/concurrent/Executor;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v1

    :cond_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_9

    goto :goto_2

    :cond_9
    const-string p4, "androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback"

    invoke-interface {p2, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    if-eqz p4, :cond_a

    instance-of v0, p4, Lc8/d;

    if-eqz v0, :cond_a

    move-object v0, p4

    check-cast v0, Lc8/d;

    goto :goto_2

    :cond_a
    new-instance v0, Lc8/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p2, v0, Lc8/d;->f:Landroid/os/IBinder;

    :goto_2
    invoke-virtual {p0, p1}, Lc8/a;->s(Ljava/lang/String;)V

    new-instance p1, Landroidx/fragment/app/d;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p3, v0, p2}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p2, p0, Lc8/a;->g:Ljava/util/concurrent/Executor;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v1
.end method

.method public final s(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lc8/a;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/util/Arrays;->stream([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, Laq0/i;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Laq0/i;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->noneMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.google.android.apps.healthdata"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "Not allowed!"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "Invalid package name!"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
