.class public abstract Lop/b;
.super Lip/h;
.source "SourceFile"

# interfaces
.implements Lop/c;


# direct methods
.method public static n0(Landroid/os/IBinder;)Lop/c;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.maps.model.internal.IMarkerDelegate"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lop/c;

    if-eqz v2, :cond_1

    check-cast v1, Lop/c;

    return-object v1

    :cond_1
    new-instance v1, Lop/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v0, v2}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    return-object v1
.end method
