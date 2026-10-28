.class public final Lyp/e;
.super Luo/h;
.source "SourceFile"


# virtual methods
.method public final b()I
    .locals 1

    const v0, 0xc042c0

    return v0
.end method

.method public final synthetic d(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.oss.licenses.IOSSLicenseService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lyp/a;

    if-eqz v1, :cond_1

    check-cast v0, Lyp/a;

    return-object v0

    :cond_1
    new-instance v0, Lyp/a;

    invoke-direct {v0, p1}, Lyp/a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.oss.licenses.IOSSLicenseService"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.oss.licenses.service.START"

    return-object v0
.end method
