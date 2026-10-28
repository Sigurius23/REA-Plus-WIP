.class public final Lip/l;
.super Luo/h;
.source "SourceFile"


# instance fields
.field public final z:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)V
    .locals 8

    const/16 v3, 0xdf

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v7}, Luo/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;I)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, v0, Lip/l;->z:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    const v0, 0x1110e58

    return v0
.end method

.method public final d(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lip/m;

    if-eqz v2, :cond_1

    check-cast v1, Lip/m;

    return-object v1

    :cond_1
    new-instance v1, Lip/m;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    return-object v1
.end method

.method public final g()[Lcom/google/android/gms/common/c;
    .locals 1

    sget-object v0, Lip/f;->d:[Lcom/google/android/gms/common/c;

    return-object v0
.end method

.method public final h()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lip/l;->z:Landroid/os/Bundle;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.identity.service.credentialsaving.START"

    return-object v0
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
