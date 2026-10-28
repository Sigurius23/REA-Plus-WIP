.class public final Lvp/d;
.super Lip/a;
.source "SourceFile"


# virtual methods
.method public final m0()Lvp/a;
    .locals 5

    const/4 v0, 0x4

    invoke-virtual {p0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"

    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v3

    instance-of v4, v3, Lvp/a;

    if-eqz v4, :cond_1

    move-object v1, v3

    check-cast v1, Lvp/a;

    goto :goto_0

    :cond_1
    new-instance v3, Lvp/a;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v2, v4}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    move-object v1, v3

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method

.method public final n0(Lcp/b;Lcom/google/android/gms/maps/GoogleMapOptions;)Lvp/f;
    .locals 3

    invoke-virtual {p0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x3

    invoke-virtual {p0, v0, p1}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.maps.internal.IMapViewDelegate"

    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lvp/f;

    if-eqz v2, :cond_1

    move-object p2, v1

    check-cast p2, Lvp/f;

    goto :goto_0

    :cond_1
    new-instance v1, Lvp/f;

    const/4 v2, 0x3

    invoke-direct {v1, p2, v0, v2}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    move-object p2, v1

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method

.method public final o0()Lop/k;
    .locals 5

    const/4 v0, 0x5

    invoke-virtual {p0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    sget v2, Lop/j;->g:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"

    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v3

    instance-of v4, v3, Lop/k;

    if-eqz v4, :cond_1

    move-object v1, v3

    check-cast v1, Lop/k;

    goto :goto_0

    :cond_1
    new-instance v3, Lop/i;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v2, v4}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    move-object v1, v3

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method
