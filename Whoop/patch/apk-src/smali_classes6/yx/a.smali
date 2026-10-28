.class public final Lyx/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lyx/b;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    const-string v3, ""

    if-nez v1, :cond_0

    move-object v1, v3

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    move-object v5, v3

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    move-object v6, v3

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v8, :cond_3

    move v8, v10

    goto :goto_0

    :cond_3
    move v8, v9

    :goto_0
    const-class v11, Lm30/g;

    invoke-virtual {v11}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v11

    invoke-virtual {v0, v11}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v11

    check-cast v11, Lm30/g;

    move v12, v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v13

    if-eqz v13, :cond_4

    move v13, v9

    move-object v9, v11

    move v11, v12

    goto :goto_1

    :cond_4
    move v13, v9

    move-object v9, v11

    move v11, v13

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v14

    if-eqz v14, :cond_5

    move v14, v12

    goto :goto_2

    :cond_5
    move v14, v12

    move v12, v13

    :goto_2
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v15}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v15

    invoke-virtual {v0, v15}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v15

    instance-of v13, v15, Ljava/lang/Integer;

    if-eqz v13, :cond_6

    check-cast v15, Ljava/lang/Integer;

    :goto_3
    move-object v13, v15

    goto :goto_4

    :cond_6
    const/4 v15, 0x0

    goto :goto_3

    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_7

    goto :goto_5

    :cond_7
    move-object v3, v15

    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v15

    if-eqz v15, :cond_8

    move v15, v14

    :goto_6
    const/16 v17, 0x0

    goto :goto_7

    :cond_8
    const/4 v15, 0x0

    goto :goto_6

    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_9

    move/from16 v17, v14

    :cond_9
    move-object v14, v3

    move-object v3, v1

    invoke-direct/range {v2 .. v17}, Lyx/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm30/g;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Z)V

    return-object v2
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lyx/b;

    return-object p1
.end method
