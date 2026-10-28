.class public final Lip/j;
.super Luo/h;
.source "SourceFile"


# instance fields
.field public final z:Loo/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Loo/b;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)V
    .locals 8

    const/16 v3, 0x44

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Luo/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;I)V

    new-instance p1, Lio/sentry/internal/debugmeta/c;

    if-nez p4, :cond_0

    sget-object p4, Loo/b;->y:Loo/b;

    :cond_0
    const/16 p2, 0x1d

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lio/sentry/internal/debugmeta/c;-><init>(IC)V

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p2, p1, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    sget-object p2, Loo/b;->y:Loo/b;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean p2, p4, Loo/b;->w:Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    iget-object p2, p4, Loo/b;->x:Ljava/lang/String;

    iput-object p2, p1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    invoke-static {}, Lip/g;->a()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    new-instance p2, Loo/b;

    invoke-direct {p2, p1}, Loo/b;-><init>(Lio/sentry/internal/debugmeta/c;)V

    iput-object p2, v0, Lip/j;->z:Loo/b;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    const v0, 0xc35000

    return v0
.end method

.method public final d(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lip/k;

    if-eqz v2, :cond_1

    check-cast v1, Lip/k;

    return-object v1

    :cond_1
    new-instance v1, Lip/k;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    return-object v1
.end method

.method public final h()Landroid/os/Bundle;
    .locals 4

    iget-object v0, p0, Lip/j;->z:Loo/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "consumer_package"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "force_save_dialog"

    iget-boolean v3, v0, Loo/b;->w:Z

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "log_session_id"

    iget-object v0, v0, Loo/b;->x:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.service.START"

    return-object v0
.end method
