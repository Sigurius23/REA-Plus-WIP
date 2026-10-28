.class public final Lcom/stripe/android/financialconnections/model/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;->valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;-><init>(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)V

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    return-object p1
.end method
