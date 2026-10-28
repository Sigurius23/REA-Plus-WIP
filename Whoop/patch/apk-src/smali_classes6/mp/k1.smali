.class public final Lmp/k1;
.super Luo/h;
.source "SourceFile"


# virtual methods
.method public final b()I
    .locals 1

    const v0, 0xc65d40

    return v0
.end method

.method public final d(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lmp/l1;

    if-eqz v2, :cond_1

    check-cast v1, Lmp/l1;

    return-object v1

    :cond_1
    new-instance v1, Lmp/l1;

    invoke-direct {v1, p1, v0}, Lmp/l1;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-object v1
.end method

.method public final g()[Lcom/google/android/gms/common/c;
    .locals 2

    sget-object v0, Lep/a;->b:Lcom/google/android/gms/common/c;

    sget-object v1, Lep/a;->a:Lcom/google/android/gms/common/c;

    filled-new-array {v0, v1}, [Lcom/google/android/gms/common/c;

    move-result-object v0

    return-object v0
.end method

.method public final h()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "FIDO2_ACTION_START_SERVICE"

    const-string v2, "com.google.android.gms.fido.fido2.regular.START"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.fido.fido2.regular.START"

    return-object v0
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
