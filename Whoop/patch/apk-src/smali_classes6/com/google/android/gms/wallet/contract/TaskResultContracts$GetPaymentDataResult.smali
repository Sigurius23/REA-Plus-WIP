.class public final Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetPaymentDataResult;
.super Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult<",
        "Ldq/l;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILandroid/content/Intent;)Lfq/a;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetApiTaskResult;->b(ILandroid/content/Intent;)Lfq/a;

    move-result-object p1

    return-object p1

    :cond_0
    sget p1, Ldq/a;->a:I

    const/4 p1, 0x0

    if-nez p2, :cond_1

    move-object p2, p1

    goto :goto_0

    :cond_1
    const-string v0, "com.google.android.gms.common.api.AutoResolveHelper.status"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/common/api/Status;

    :goto_0
    new-instance v0, Lfq/a;

    if-nez p2, :cond_2

    sget-object p2, Lcom/google/android/gms/common/api/Status;->G:Lcom/google/android/gms/common/api/Status;

    :cond_2
    invoke-direct {v0, p1, p2}, Lfq/a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public final c(Landroid/content/Intent;)Ldq/l;
    .locals 2

    sget-object v0, Ldq/l;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "com.google.android.gms.wallet.PaymentData"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lrg/a;->j([BLandroid/os/Parcelable$Creator;)Lvo/d;

    move-result-object p1

    :goto_0
    check-cast p1, Ldq/l;

    return-object p1
.end method

.method public final bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetPaymentDataResult;->b(ILandroid/content/Intent;)Lfq/a;

    move-result-object p1

    return-object p1
.end method
