.class public final Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetPaymentData;
.super Lcom/google/android/gms/wallet/contract/TaskResultContracts$UnpackApiTaskResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wallet/contract/TaskResultContracts$UnpackApiTaskResult<",
        "Ldq/l;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$UnpackApiTaskResult;-><init>()V

    return-void
.end method


# virtual methods
.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 2

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    sget-object v0, Ldq/l;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "com.google.android.gms.wallet.PaymentData"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2, v0}, Lrg/a;->j([BLandroid/os/Parcelable$Creator;)Lvo/d;

    move-result-object p1

    :goto_0
    check-cast p1, Ldq/l;

    :cond_1
    return-object p1
.end method
