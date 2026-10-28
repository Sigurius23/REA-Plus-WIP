.class public final Lp00/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lp00/q;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    move v1, v3

    move v3, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    move v4, v1

    :goto_1
    const-class v6, Lp00/q;

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v7

    check-cast v7, Lzy/c;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-eqz v8, :cond_2

    move-object v8, v6

    move v6, v5

    goto :goto_2

    :cond_2
    move-object v8, v6

    move v6, v1

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_3

    move v9, v5

    move-object v5, v7

    move v7, v9

    :goto_3
    move-object v10, v8

    goto :goto_4

    :cond_3
    move v9, v5

    move-object v5, v7

    move v7, v1

    goto :goto_3

    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    move v11, v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v12

    if-eqz v12, :cond_4

    move-object v12, v10

    move v10, v11

    goto :goto_5

    :cond_4
    move-object v12, v10

    move v10, v1

    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_5

    move v13, v11

    goto :goto_6

    :cond_5
    move v13, v11

    move v11, v1

    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-nez v14, :cond_6

    const/4 v14, 0x0

    goto :goto_7

    :cond_6
    sget-object v14, Lq00/o;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v14, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v14

    :goto_7
    check-cast v14, Lq00/o;

    invoke-virtual {v12}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    invoke-virtual {v0, v12}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v12

    check-cast v12, Lcom/stripe/android/model/ConsentUi$ConsentSection;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_7

    move v15, v13

    move-object v13, v12

    move-object v12, v14

    move v14, v15

    goto :goto_8

    :cond_7
    move-object v13, v12

    move-object v12, v14

    move v14, v1

    :goto_8
    invoke-direct/range {v2 .. v14}, Lp00/q;-><init>(ZZLzy/c;ZZLjava/lang/String;Ljava/lang/String;ZZLq00/o;Lcom/stripe/android/model/ConsentUi$ConsentSection;Z)V

    return-object v2
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lp00/q;

    return-object p1
.end method
