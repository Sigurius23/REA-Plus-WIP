.class public final Lcom/stripe/android/financialconnections/model/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v7, v1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    move-result-object v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-result-object v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v11, 0x0

    :goto_1
    if-eq v11, v1, :cond_1

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v11, 0x0

    if-nez v1, :cond_2

    move-object v1, v11

    goto :goto_2

    :cond_2
    sget-object v1, Lcom/stripe/android/financialconnections/model/Balance;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_2
    check-cast v1, Lcom/stripe/android/financialconnections/model/Balance;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v12

    if-nez v12, :cond_3

    move-object v12, v11

    goto :goto_3

    :cond_3
    sget-object v12, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v12, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v12

    :goto_3
    check-cast v12, Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-nez v16, :cond_4

    move-object v2, v11

    goto :goto_4

    :cond_4
    sget-object v2, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_4
    check-cast v2, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-nez v17, :cond_5

    move-object/from16 v17, v1

    :goto_5
    move-object/from16 v16, v2

    goto :goto_7

    :cond_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v11}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v17, v1

    const/4 v1, 0x0

    :goto_6
    if-eq v1, v11, :cond_6

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    move/from16 v18, v1

    invoke-static/range {v16 .. v16}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v18, 0x1

    goto :goto_6

    :cond_6
    move-object v11, v0

    goto :goto_5

    :goto_7
    new-instance v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move-object/from16 v19, v17

    move-object/from16 v17, v11

    move-object/from16 v11, v19

    invoke-direct/range {v2 .. v17}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V

    return-object v2
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    return-object p1
.end method
