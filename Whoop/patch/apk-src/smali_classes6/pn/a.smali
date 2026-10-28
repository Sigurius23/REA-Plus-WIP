.class public final Lpn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lpn/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lpn/a;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lq20/o;

    const-class v2, Lq20/o;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lzy/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_0

    const/4 v6, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v9

    check-cast v9, Ly00/d5;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lq20/h;->valueOf(Ljava/lang/String;)Lq20/h;

    move-result-object v10

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v11

    invoke-virtual {v1, v11}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v11

    check-cast v11, Ly00/u5;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Ly00/j5;

    invoke-direct/range {v3 .. v12}, Lq20/o;-><init>(Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ly00/d5;Lq20/h;Ly00/u5;Ly00/j5;)V

    return-object v3

    :pswitch_0
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lq20/n;

    const-class v2, Lq20/n;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ly00/d5;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lq20/h;->valueOf(Ljava/lang/String;)Lq20/h;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v7

    check-cast v7, Ly00/u5;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v8

    check-cast v8, Ly00/j5;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lj00/i0;

    invoke-direct/range {v3 .. v9}, Lq20/n;-><init>(Ly00/d5;Ly00/i;Lq20/h;Ly00/u5;Ly00/j5;Lj00/i0;)V

    return-object v3

    :pswitch_1
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lq20/m;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lwz/h0;->valueOf(Ljava/lang/String;)Lwz/h0;

    move-result-object v3

    const-class v4, Lq20/m;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lwz/u0;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ly00/j0;

    invoke-direct {v2, v3, v5, v1}, Lq20/m;-><init>(Lwz/h0;Lwz/u0;Ly00/j0;)V

    return-object v2

    :pswitch_2
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Lq20/j;->x:Lq20/j;

    return-object v1

    :pswitch_3
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lq20/i;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v2, Lq20/i;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Ly00/v3;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lzy/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v3 .. v9}, Lq20/i;-><init>(Ljava/lang/String;Ly00/v3;Lzy/c;ILjava/lang/String;Ljava/lang/String;)V

    return-object v3

    :pswitch_4
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lq20/g;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v2, Lq20/g;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Ly00/v3;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lzy/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Lq20/g;-><init>(Ljava/lang/String;Ly00/v3;Lzy/c;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :pswitch_5
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lq20/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lq20/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_6
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lq10/a;

    sget-object v3, Lh20/g3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh20/g3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lq10/a;-><init>(Lh20/g3;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_7
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/financialconnections/model/ManualEntry;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/financialconnections/model/ManualEntryMode;->valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/stripe/android/financialconnections/model/ManualEntry;-><init>(Lcom/stripe/android/financialconnections/model/ManualEntryMode;)V

    return-object v2

    :pswitch_8
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v5, v3

    :goto_1
    const/4 v6, 0x1

    if-eq v5, v2, :cond_1

    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v7, v1, v4, v5, v6}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v5

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_3

    move-object v7, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v7, v2

    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_4

    :goto_4
    move-object v8, v3

    goto :goto_5

    :cond_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_4

    :goto_5
    new-instance v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;-><init>(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v3

    :pswitch_9
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_5

    const/4 v1, 0x0

    goto :goto_7

    :cond_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v4, 0x0

    :goto_6
    if-eq v4, v2, :cond_6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_6
    move-object v1, v3

    :goto_7
    new-instance v2, Lcom/stripe/android/financialconnections/model/CreditBalance;

    invoke-direct {v2, v1}, Lcom/stripe/android/financialconnections/model/CreditBalance;-><init>(Ljava/util/Map;)V

    return-object v2

    :pswitch_a
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_7

    const/4 v1, 0x0

    goto :goto_9

    :cond_7
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v4, 0x0

    :goto_8
    if-eq v4, v2, :cond_8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_8
    move-object v1, v3

    :goto_9
    new-instance v2, Lcom/stripe/android/financialconnections/model/CashBalance;

    invoke-direct {v2, v1}, Lcom/stripe/android/financialconnections/model/CashBalance;-><init>(Ljava/util/Map;)V

    return-object v2

    :pswitch_b
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/stripe/android/financialconnections/model/BankAccount;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    :goto_a
    move v8, v1

    goto :goto_b

    :cond_9
    const/4 v1, 0x0

    goto :goto_a

    :goto_b
    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/financialconnections/model/BankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v3

    :pswitch_c
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lpv/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_a

    move v2, v4

    move v4, v5

    goto :goto_c

    :cond_a
    move v2, v4

    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_b

    move v6, v5

    goto :goto_d

    :cond_b
    move v6, v5

    move v5, v2

    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-eqz v7, :cond_c

    move v7, v6

    goto :goto_e

    :cond_c
    move v7, v6

    move v6, v2

    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-eqz v8, :cond_d

    move v8, v7

    goto :goto_f

    :cond_d
    move v8, v7

    move v7, v2

    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_e

    move v9, v8

    goto :goto_10

    :cond_e
    move v9, v8

    move v8, v2

    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_1b

    const-string v11, "HORIZONTAL"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    const/4 v10, 0x1

    goto :goto_11

    :cond_f
    const-string v11, "VERTICAL"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    const/4 v10, 0x2

    goto :goto_11

    :cond_10
    const-string v11, "HORIZONTAL_AND_VERTICAL"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1a

    const/4 v10, 0x3

    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v11

    if-eqz v11, :cond_11

    move v11, v9

    move v9, v10

    move v10, v11

    goto :goto_12

    :cond_11
    move v11, v9

    move v9, v10

    move v10, v2

    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v12

    if-eqz v12, :cond_12

    move v12, v11

    goto :goto_13

    :cond_12
    move v12, v11

    move v11, v2

    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_13

    move v13, v12

    goto :goto_14

    :cond_13
    move v13, v12

    move v12, v2

    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v14

    check-cast v14, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-eqz v15, :cond_14

    move v15, v13

    move-object v13, v14

    move v14, v15

    goto :goto_15

    :cond_14
    move v15, v13

    move-object v13, v14

    move v14, v2

    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-eqz v16, :cond_15

    move/from16 v16, v15

    goto :goto_16

    :cond_15
    move/from16 v16, v15

    move v15, v2

    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-eqz v17, :cond_16

    move/from16 v17, v16

    goto :goto_17

    :cond_16
    move/from16 v17, v16

    move/from16 v16, v2

    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-eqz v18, :cond_17

    move/from16 v18, v17

    goto :goto_18

    :cond_17
    move/from16 v18, v17

    move/from16 v17, v2

    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v19

    if-eqz v19, :cond_18

    move/from16 v19, v18

    goto :goto_19

    :cond_18
    move/from16 v19, v18

    move/from16 v18, v2

    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v20

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_19

    move/from16 v21, v20

    move/from16 v20, v19

    move/from16 v19, v21

    goto :goto_1a

    :cond_19
    move/from16 v19, v20

    move/from16 v20, v2

    :goto_1a
    invoke-direct/range {v3 .. v20}, Lpv/b;-><init>(ZZZZZIZZZLcom/mapbox/maps/ScreenCoordinate;ZZZZZFZ)V

    return-object v3

    :cond_1a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "No enum constant com.mapbox.maps.plugin.ScrollMode."

    invoke-virtual {v2, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1b
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Name is null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_d
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_1e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1d

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1c

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1b

    :cond_1c
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1b

    :cond_1d
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1b

    :cond_1e
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lpo/k;

    invoke-direct {v1, v3, v4}, Lpo/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_e
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_1f

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1c

    :pswitch_f
    sget-object v4, Lgp/q;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lgp/q;

    goto :goto_1c

    :pswitch_10
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v12

    goto :goto_1c

    :pswitch_11
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v11

    goto :goto_1c

    :pswitch_12
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v10

    goto :goto_1c

    :pswitch_13
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Landroid/net/Uri;

    goto :goto_1c

    :pswitch_14
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1c

    :pswitch_15
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1c

    :pswitch_16
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1c

    :pswitch_17
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1c

    :cond_1f
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Lpo/j;

    invoke-direct/range {v4 .. v13}, Lpo/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgp/q;)V

    return-object v4

    :pswitch_18
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_21

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_20

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1d

    :cond_20
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    goto :goto_1d

    :cond_21
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lpo/i;

    invoke-direct {v1, v3}, Lpo/i;-><init>(Landroid/app/PendingIntent;)V

    return-object v1

    :pswitch_19
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v4

    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_25

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x1

    if-eq v7, v8, :cond_24

    const/4 v8, 0x2

    if-eq v7, v8, :cond_23

    const/4 v8, 0x3

    if-eq v7, v8, :cond_22

    invoke-static {v1, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1e

    :cond_22
    invoke-static {v1, v6}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_1e

    :cond_23
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1e

    :cond_24
    sget-object v4, Lpo/k;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v6, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lpo/k;

    goto :goto_1e

    :cond_25
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lpo/h;

    invoke-direct {v1, v4, v5, v3}, Lpo/h;-><init>(Lpo/k;Ljava/lang/String;I)V

    return-object v1

    :pswitch_1a
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_1f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_27

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_26

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1f

    :cond_26
    invoke-static {v1, v4}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    goto :goto_1f

    :cond_27
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lpo/d;

    invoke-direct {v1, v3}, Lpo/d;-><init>(Z)V

    return-object v1

    :pswitch_1b
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v4

    move-object v4, v3

    :goto_20
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_2b

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x1

    if-eq v7, v8, :cond_2a

    const/4 v8, 0x2

    if-eq v7, v8, :cond_29

    const/4 v8, 0x3

    if-eq v7, v8, :cond_28

    invoke-static {v1, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_20

    :cond_28
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_20

    :cond_29
    invoke-static {v1, v6}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_20

    :cond_2a
    invoke-static {v1, v6}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v5

    goto :goto_20

    :cond_2b
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lpo/c;

    invoke-direct {v1, v5, v3, v4}, Lpo/c;-><init>(Z[BLjava/lang/String;)V

    return-object v1

    :pswitch_1c
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_21
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_2e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_2d

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2c

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_21

    :cond_2c
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_21

    :cond_2d
    invoke-static {v1, v5}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v4

    goto :goto_21

    :cond_2e
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lpo/b;

    invoke-direct {v1, v4, v3}, Lpo/b;-><init>(ZLjava/lang/String;)V

    return-object v1

    :pswitch_1d
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v6, v3

    move v9, v6

    move v12, v9

    move-object v7, v4

    move-object v8, v7

    move-object v10, v8

    move-object v11, v10

    :goto_22
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_2f

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_2

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_22

    :pswitch_1e
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v12

    goto :goto_22

    :pswitch_1f
    invoke-static {v1, v3}, Lvo/b;->j(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    move-result-object v11

    goto :goto_22

    :pswitch_20
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v10

    goto :goto_22

    :pswitch_21
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v9

    goto :goto_22

    :pswitch_22
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_22

    :pswitch_23
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v7

    goto :goto_22

    :pswitch_24
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v6

    goto :goto_22

    :cond_2f
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v5, Lpo/a;

    invoke-direct/range {v5 .. v12}, Lpo/a;-><init>(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Z)V

    return-object v5

    :pswitch_25
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v10, v3

    move v11, v10

    move-object v6, v4

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    :goto_23
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_30

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_3

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_23

    :pswitch_26
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v11

    goto :goto_23

    :pswitch_27
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v10

    goto :goto_23

    :pswitch_28
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v9

    goto :goto_23

    :pswitch_29
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_23

    :pswitch_2a
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v7

    goto :goto_23

    :pswitch_2b
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_23

    :cond_30
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v5, Lpo/g;

    invoke-direct/range {v5 .. v11}, Lpo/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    return-object v5

    :pswitch_2c
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_24
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_32

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_31

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_24

    :cond_31
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    goto :goto_24

    :cond_32
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lpo/f;

    invoke-direct {v1, v3}, Lpo/f;-><init>(Landroid/app/PendingIntent;)V

    return-object v1

    :pswitch_2d
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v9, v3

    move v10, v9

    move v13, v10

    move-object v6, v4

    move-object v7, v6

    move-object v8, v7

    move-object v11, v8

    move-object v12, v11

    :goto_25
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_33

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_4

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_25

    :pswitch_2e
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v13

    goto :goto_25

    :pswitch_2f
    sget-object v4, Lpo/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Lpo/b;

    goto :goto_25

    :pswitch_30
    sget-object v4, Lpo/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lpo/c;

    goto :goto_25

    :pswitch_31
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v10

    goto :goto_25

    :pswitch_32
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v9

    goto :goto_25

    :pswitch_33
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_25

    :pswitch_34
    sget-object v4, Lpo/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lpo/a;

    goto :goto_25

    :pswitch_35
    sget-object v4, Lpo/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lpo/d;

    goto :goto_25

    :cond_33
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v5, Lpo/e;

    invoke-direct/range {v5 .. v13}, Lpo/e;-><init>(Lpo/d;Lpo/a;Ljava/lang/String;ZILpo/c;Lpo/b;Z)V

    return-object v5

    :pswitch_36
    new-instance v2, Lpn/k;

    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lpn/k;-><init>(JJ)V

    return-object v2

    :pswitch_37
    new-instance v2, Lpn/j;

    invoke-direct {v2, v1}, Lpn/j;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_38
    new-instance v1, Lpn/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    return-object v1

    :pswitch_39
    new-instance v2, Lpn/f;

    invoke-direct {v2, v1}, Lpn/f;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_3a
    new-instance v2, Lpn/b;

    invoke-direct {v2, v1}, Lpn/b;-><init>(Landroid/os/Parcel;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_2d
        :pswitch_2c
        :pswitch_25
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpn/a;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lq20/o;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lq20/n;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lq20/m;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lq20/j;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lq20/i;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lq20/g;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lq20/c;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lq10/a;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/ManualEntry;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/CreditBalance;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/CashBalance;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/BankAccount;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lpv/b;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lpo/k;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lpo/j;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lpo/i;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lpo/h;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lpo/d;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lpo/c;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lpo/b;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lpo/a;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lpo/g;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lpo/f;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lpo/e;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lpn/k;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lpn/j;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lpn/g;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lpn/f;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lpn/b;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
