.class public final Lsp/k;
.super Luo/h;
.source "SourceFile"


# instance fields
.field public final A:I

.field public final B:Ljava/lang/String;

.field public final C:I

.field public final D:Z

.field public final z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;I)V
    .locals 8

    const/4 v3, 0x4

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v7}, Luo/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;I)V

    iput-object v1, v0, Lsp/k;->z:Landroid/content/Context;

    iput p6, v0, Lsp/k;->A:I

    const/4 p1, 0x0

    iput-object p1, v0, Lsp/k;->B:Ljava/lang/String;

    const/4 p1, 0x1

    iput p1, v0, Lsp/k;->C:I

    iput-boolean p1, v0, Lsp/k;->D:Z

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    const v0, 0xc042c0

    return v0
.end method

.method public final d(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.wallet.internal.IOwService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lsp/h;

    if-eqz v2, :cond_1

    check-cast v1, Lsp/h;

    return-object v1

    :cond_1
    new-instance v1, Lsp/h;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v0, v2}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    return-object v1
.end method

.method public final g()[Lcom/google/android/gms/common/c;
    .locals 1

    sget-object v0, Ldq/u;->d:[Lcom/google/android/gms/common/c;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.wallet.internal.IOwService"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.wallet.service.BIND"

    return-object v0
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final u()Landroid/os/Bundle;
    .locals 4

    iget-object v0, p0, Lsp/k;->z:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "com.google.android.gms.wallet.EXTRA_ENVIRONMENT"

    iget v3, p0, Lsp/k;->A:I

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND"

    iget-boolean v3, p0, Lsp/k;->D:Z

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "androidPackageName"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lsp/k;->B:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Landroid/accounts/Account;

    const-string v3, "com.google"

    invoke-direct {v2, v0, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    iget v0, p0, Lsp/k;->C:I

    const-string v2, "com.google.android.gms.wallet.EXTRA_THEME"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v1
.end method
