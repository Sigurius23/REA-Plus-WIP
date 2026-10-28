.class public final Lcom/stripe/android/financialconnections/model/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    move-result-object v1

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh;-><init>(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)V

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    return-object p1
.end method
