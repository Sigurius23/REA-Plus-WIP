.class public final Lcom/stripe/android/financialconnections/model/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;)V

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    return-object p1
.end method
