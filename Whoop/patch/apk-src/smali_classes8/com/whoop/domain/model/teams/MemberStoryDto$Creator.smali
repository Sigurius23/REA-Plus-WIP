.class public final Lcom/whoop/domain/model/teams/MemberStoryDto$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/MemberStoryDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/domain/model/teams/MemberStoryDto;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/MemberStoryDto;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/domain/model/teams/MemberStoryDto;

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

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eqz v1, :cond_0

    move v1, v14

    move v14, v15

    goto :goto_0

    :cond_0
    move v1, v14

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-eqz v16, :cond_1

    move/from16 v16, v15

    goto :goto_1

    :cond_1
    move/from16 v16, v15

    move v15, v1

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-eqz v17, :cond_2

    move/from16 v17, v16

    goto :goto_2

    :cond_2
    move/from16 v17, v16

    move/from16 v16, v1

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-eqz v18, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v17, v1

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/16 v18, 0x0

    if-nez v1, :cond_4

    move-object/from16 v1, v18

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v20

    if-nez v20, :cond_5

    move-object/from16 v0, v18

    move-object/from16 v18, v1

    goto :goto_5

    :cond_5
    move-object/from16 v18, v1

    sget-object v1, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    move-object/from16 v20, v0

    check-cast v20, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;

    invoke-direct/range {v2 .. v20}, Lcom/whoop/domain/model/teams/MemberStoryDto;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/MemberStoryDto$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/MemberStoryDto;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/domain/model/teams/MemberStoryDto;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/domain/model/teams/MemberStoryDto;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/MemberStoryDto$Creator;->newArray(I)[Lcom/whoop/domain/model/teams/MemberStoryDto;

    move-result-object p1

    return-object p1
.end method
