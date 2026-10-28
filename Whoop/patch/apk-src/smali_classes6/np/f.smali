.class public final Lnp/f;
.super Lip/h;
.source "SourceFile"

# interfaces
.implements Ltp/x;


# static fields
.field public static final synthetic h:I


# instance fields
.field public final g:Lto/k;


# direct methods
.method public constructor <init>(Lto/k;)V
    .locals 2

    const-string v0, "com.google.android.gms.location.ILocationCallback"

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lip/h;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lnp/f;->g:Lto/k;

    return-void
.end method


# virtual methods
.method public final declared-synchronized i0()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnp/f;->g:Lto/k;

    const/4 v1, 0x0

    iput-object v1, v0, Lto/k;->b:Lto/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final m0(Landroid/os/Parcel;I)Z
    .locals 3

    iget-object v0, p0, Lnp/f;->g:Lto/k;

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-eq p2, v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object p2, Lcom/google/android/gms/location/LocationAvailability;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, p2}, Lnp/l;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/location/LocationAvailability;

    new-instance p2, Lla/b;

    const/16 v2, 0x12

    invoke-direct {p2, p1, v2}, Lla/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lds/s;

    const/16 v2, 0xf

    invoke-direct {p1, v2, v0, p2}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, v0, Lto/k;->a:Lap/a;

    invoke-virtual {p2, p1}, Lap/a;->execute(Ljava/lang/Runnable;)V

    return v1

    :cond_1
    sget-object p2, Lcom/google/android/gms/location/LocationResult;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, p2}, Lnp/l;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/location/LocationResult;

    new-instance p2, Lla/b;

    const/16 v2, 0x11

    invoke-direct {p2, p1, v2}, Lla/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lds/s;

    const/16 v2, 0xf

    invoke-direct {p1, v2, v0, p2}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, v0, Lto/k;->a:Lap/a;

    invoke-virtual {p2, p1}, Lap/a;->execute(Ljava/lang/Runnable;)V

    return v1
.end method
