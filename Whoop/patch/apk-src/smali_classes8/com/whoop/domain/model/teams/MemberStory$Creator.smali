.class public final Lcom/whoop/domain/model/teams/MemberStory$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/MemberStory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/domain/model/teams/MemberStory;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/MemberStory;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/domain/model/teams/MemberStory;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v1, :cond_0

    move v1, v11

    move v11, v12

    move v13, v11

    goto :goto_0

    :cond_0
    move v1, v11

    move v13, v12

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-eqz v14, :cond_1

    move v14, v13

    goto :goto_1

    :cond_1
    move v14, v13

    move v13, v1

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-eqz v15, :cond_2

    move v15, v14

    goto :goto_2

    :cond_2
    move v15, v14

    move v14, v1

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-eqz v16, :cond_3

    move/from16 v16, v15

    goto :goto_3

    :cond_3
    move/from16 v16, v15

    move v15, v1

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-eqz v17, :cond_4

    goto :goto_4

    :cond_4
    move/from16 v16, v1

    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v18

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_5

    const/4 v0, 0x0

    goto :goto_5

    :cond_5
    sget-object v1, Lcom/whoop/data/local/room/entity/AmaHost;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    move-object/from16 v21, v0

    check-cast v21, Lcom/whoop/data/local/room/entity/AmaHost;

    invoke-direct/range {v2 .. v21}, Lcom/whoop/domain/model/teams/MemberStory;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/MemberStory$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/MemberStory;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/domain/model/teams/MemberStory;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/domain/model/teams/MemberStory;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/MemberStory$Creator;->newArray(I)[Lcom/whoop/domain/model/teams/MemberStory;

    move-result-object p1

    return-object p1
.end method
