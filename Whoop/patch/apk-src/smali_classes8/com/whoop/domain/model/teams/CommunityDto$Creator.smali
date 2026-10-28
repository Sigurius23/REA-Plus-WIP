.class public final Lcom/whoop/domain/model/teams/CommunityDto$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/CommunityDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/domain/model/teams/CommunityDto;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/CommunityDto;
    .locals 23

    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-eqz v8, :cond_2

    const/4 v8, 0x1

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_3

    const/4 v9, 0x1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_4

    const/4 v13, 0x1

    goto :goto_4

    :cond_4
    const/4 v13, 0x0

    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v14

    const/4 v15, 0x0

    if-nez v14, :cond_5

    move-object v14, v15

    goto :goto_5

    :cond_5
    sget-object v14, Lcom/whoop/domain/model/teams/TeamType;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v14, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v14

    :goto_5
    check-cast v14, Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-nez v16, :cond_6

    move-object v2, v15

    goto :goto_6

    :cond_6
    sget-object v2, Lcom/whoop/domain/model/teams/CommunityMetaDataDto;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_6
    check-cast v2, Lcom/whoop/domain/model/teams/CommunityMetaDataDto;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-nez v17, :cond_7

    move-object/from16 v17, v15

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-nez v18, :cond_8

    move-object/from16 v18, v15

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v19

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    if-eqz v19, :cond_9

    const/16 v18, 0x1

    :goto_9
    const/16 v19, 0x0

    goto :goto_a

    :cond_9
    const/16 v18, 0x0

    goto :goto_9

    :goto_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v20

    if-nez v20, :cond_a

    move/from16 v21, v1

    :goto_b
    move-object/from16 v19, v2

    move/from16 v22, v3

    goto :goto_d

    :cond_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v15}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v21, v1

    move/from16 v1, v19

    :goto_c
    if-eq v1, v15, :cond_b

    move-object/from16 v19, v2

    sget-object v2, Lcom/whoop/domain/model/teams/ChatChannelDto;->CREATOR:Landroid/os/Parcelable$Creator;

    move/from16 v22, v3

    const/4 v3, 0x1

    .line 1
    invoke-static {v2, v0, v4, v1, v3}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v1

    move-object/from16 v2, v19

    move/from16 v3, v22

    goto :goto_c

    :cond_b
    move-object v15, v4

    goto :goto_b

    .line 2
    :goto_d
    new-instance v2, Lcom/whoop/domain/model/teams/CommunityDto;

    move-object/from16 v3, v19

    move-object/from16 v19, v15

    move-object v15, v3

    move/from16 v4, v21

    move/from16 v3, v22

    invoke-direct/range {v2 .. v19}, Lcom/whoop/domain/model/teams/CommunityDto;-><init>(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/CommunityMetaDataDto;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/CommunityDto$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/CommunityDto;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/domain/model/teams/CommunityDto;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/domain/model/teams/CommunityDto;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/CommunityDto$Creator;->newArray(I)[Lcom/whoop/domain/model/teams/CommunityDto;

    move-result-object p1

    return-object p1
.end method
